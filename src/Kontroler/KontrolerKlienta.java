package Kontroler;

public class KontrolerKlienta implements IKontrolerKlienta {
	private IProdukt _produkt;
	private IZamowienie _zamowienie;
	private IKoszyk _koszyk;
	private ObslugaZamowien _obslugaZamowien;

	public KontrolerKlienta(IProdukt produkt, IZamowienie zamowienie, IKoszyk koszyk) {
		this._produkt = produkt; this._zamowienie = zamowienie; this._koszyk = koszyk;
	}
	public KontrolerKlienta(EncjaFasada fasada) { this(fasada, fasada, fasada); }
	public KontrolerKlienta(ObslugaZamowien zamowienia, ObslugaProduktow produkty) { this._obslugaZamowien = zamowienia; this._produkt = produkty == null ? null : produkty._produkt; }
	public void przegladajOferte() { if (_produkt == null) return; for (Produkt p : _produkt.pobierzWszystkie()) System.out.println(p.getNazwa() + " - " + p.getCena() + " zł"); }
	public void dodajDoKoszyka(int id, int ilosc) { if (_obslugaZamowien != null) _obslugaZamowien.dodajDoKoszyka(id, ilosc); else if (_koszyk != null) _koszyk.dodajProdukt(id, ilosc); }
	public void zlozZamowienie() { if (_obslugaZamowien != null) _obslugaZamowien.zlozZamowienie(); else if (_zamowienie != null) { _zamowienie.zapiszZamowienie(new Zamowienie()); if (_koszyk != null) _koszyk.wyczysc(); } }
	public void anulujZamowienie(int id) { if (_zamowienie != null) _zamowienie.zmienStatus(id, "ANULOWANE"); }
	public boolean zaplac(String email) { if (email == null || email.trim().isEmpty()) return false; return _obslugaZamowien == null || _obslugaZamowien.zaplac(email); }
	public void wyswietlHistorie() { System.out.println("Historia zamówień dostępna po zalogowaniu."); }
	public void zglosZwrot(int id) { if (_zamowienie != null) _zamowienie.zmienStatus(id, "ZWROT"); }
	public void zglosReklamacje(int id) { if (_zamowienie != null) _zamowienie.zmienStatus(id, "REKLAMACJA"); }
	public void zaloguj(String login, String haslo) { if (login == null || login.trim().isEmpty() || haslo == null || haslo.isEmpty()) throw new IllegalArgumentException("Podaj login i hasło"); System.out.println("Zalogowano: " + login); }
	public void zarejestruj() { System.out.println("Rejestracja wymaga danych użytkownika."); }
	public void wyswietlPotwierdzenie(int numer) { System.out.println("Zamówienie nr " + numer); }
}
