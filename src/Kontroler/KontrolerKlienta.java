package Kontroler;

public class KontrolerKlienta implements IKontrolerKlienta {
	private IProdukt _produkt;
	private IZamowienie _zamowienie;
	private IKoszyk _koszyk;

	public KontrolerKlienta(IProdukt aProdukt, IZamowienie aZamowienie, IKoszyk aKoszyk) {
		this._produkt = aProdukt;
		this._zamowienie = aZamowienie;
		this._koszyk = aKoszyk;
	}

	public KontrolerKlienta(EncjaFasada aFasadaModelu) {
		this(aFasadaModelu, aFasadaModelu, aFasadaModelu);
	}

	public void przegladajOferte() {
		if (_produkt == null) return;
		Produkt[] produkty = _produkt.pobierzWszystkie();
		if (produkty == null) return;
		for (Produkt produkt : produkty) {
			System.out.println(produkt.getIdProduktu() + " - " + produkt.getNazwa()
					+ " - " + produkt.getCena() + " zł");
		}
	}

	public void dodajDoKoszyka(int aIdProduktu, int aIlosc) {
		if (_koszyk == null) throw new IllegalStateException("Koszyk nie został skonfigurowany");
		_koszyk.dodajProdukt(aIdProduktu, aIlosc);
	}

	public void zlozZamowienie() {
		if (_zamowienie == null) throw new IllegalStateException("Usługa zamówień nie została skonfigurowana");
		Zamowienie zamowienie = new Zamowienie();
		_zamowienie.zapiszZamowienie(zamowienie);
		if (_koszyk != null) _koszyk.wyczysc();
	}

	public void anulujZamowienie(int aIdZamowienia) {
		if (_zamowienie != null) _zamowienie.zmienStatus(aIdZamowienia, "ANULOWANE");
	}

	public void zaplac(String aEmail) {
		System.out.println("Zarejestrowano płatność dla: " + aEmail);
	}

	public void wyswietlHistorie() {
		System.out.println("Historia zamówień jest pusta w tym trybie demonstracyjnym.");
	}

	public void zglosZwrot(int aIdZamowienia) {
		if (_zamowienie != null) _zamowienie.zmienStatus(aIdZamowienia, "ZWROT");
	}

	public void zglosReklamacje(int aIdZamowienia) {
		if (_zamowienie != null) _zamowienie.zmienStatus(aIdZamowienia, "REKLAMACJA");
	}

	public void zaloguj(String aLogin, String aHaslo) {
		if (aLogin == null || aLogin.trim().isEmpty() || aHaslo == null || aHaslo.isEmpty()) {
			throw new IllegalArgumentException("Podaj login i hasło");
		}
		System.out.println("Zalogowano użytkownika: " + aLogin);
	}

	public void zarejestruj() {
		System.out.println("Rejestracja użytkownika jest dostępna po podaniu danych konta.");
	}
}
