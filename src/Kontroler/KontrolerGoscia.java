package Kontroler;

public class KontrolerGoscia implements IKontrolerGoscia {
	private IProdukt _produkt;
	public IStrategiaFiltrowania _strategia;
	public KontrolerGoscia(IProdukt produkt) { this._produkt = produkt; }
	public void zarejestruj() { System.out.println("Rejestracja użytkownika."); }
	public void zaloguj(String login, String haslo) { if (login == null || login.trim().isEmpty() || haslo == null || haslo.isEmpty()) throw new IllegalArgumentException("Podaj login i hasło"); System.out.println("Zalogowano: " + login); }
	public void przegladajOferte() { if (_produkt != null) for (Produkt p : _produkt.pobierzWszystkie()) System.out.println(p.getNazwa() + " - " + p.getCena() + " zł"); }
}
