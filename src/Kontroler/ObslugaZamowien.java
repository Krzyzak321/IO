package Kontroler;

public class ObslugaZamowien {
	public IKoszyk _koszyk;
	public IZamowienie _zamowenie;
	private IProdukt produkty;
	private int ostatnieZamowienie;
	public ObslugaZamowien(IZamowienie zamowienie, Object koszyk) { this._zamowenie = zamowienie; this._koszyk = koszyk instanceof IKoszyk ? (IKoszyk) koszyk : null; this.produkty = zamowienie instanceof IProdukt ? (IProdukt) zamowienie : null; }
	public void zlozZamowienie() { if (_zamowenie == null) throw new IllegalStateException("Brak obsługi zamówień"); Zamowienie z = new Zamowienie(); ostatnieZamowienie = _zamowenie.zapiszZamowienie(z); if (_koszyk != null) _koszyk.wyczysc(); }
	public void anulujZamowienie(int id) { if (_zamowenie != null) _zamowenie.zmienStatus(id, "ANULOWANE"); }
	public void dodajDoKoszyka(int id, int ilosc) { if (_koszyk == null) throw new IllegalStateException("Brak koszyka"); _koszyk.dodajProdukt(id, ilosc); }
	public void wyswietlPotwierdzenie(int id) { System.out.println("Zamówienie nr " + id); }
	public boolean zaplac(String email) { return email != null && !email.trim().isEmpty(); }
}
