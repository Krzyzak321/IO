package Kontroler;

public class KontrolerGoscia implements IKontrolerGoscia {
	private IProdukt _produkt;
	public IStrategiaFiltrowania _strategia;

	public KontrolerGoscia(IProdukt aProdukt) {
		this._produkt = aProdukt;
	}

	public void zarejestruj() {
		System.out.println("Rejestracja gościa.");
	}

	public void zaloguj(String aLogin, String aHaslo) {
		if (aLogin == null || aLogin.trim().isEmpty() || aHaslo == null || aHaslo.isEmpty()) {
			throw new IllegalArgumentException("Podaj login i hasło");
		}
		System.out.println("Zalogowano: " + aLogin);
	}

	public void przegladajOferte() {
		if (_produkt == null) return;
		Produkt[] produkty = _produkt.pobierzWszystkie();
		if (produkty != null) {
			for (Produkt produkt : produkty) {
				System.out.println(produkt.getNazwa() + " - " + produkt.getCena() + " zł");
			}
		}
	}
}
