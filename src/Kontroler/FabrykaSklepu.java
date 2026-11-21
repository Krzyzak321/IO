package Kontroler;

public class FabrykaSklepu implements IFabrykaEncji {
	private int nextProductId = 1;
	private int nextOrderId = 1;
	private int nextUserId = 1;
	public FabrykaSklepu() { }
	public Produkt utworzProdukt(String nazwa, double cena) { return new Produkt(nextProductId++, nazwa, cena, 0); }
	public Zamowienie utworzZamowienie() { Zamowienie z = new Zamowienie(); z.setId(nextOrderId++); return z; }
	public Uzytkownik utworzUzytkownika(String login, String haslo) { return new Uzytkownik(nextUserId++, login, haslo); }
	public Koszyk utworzKoszyk() { return new Koszyk(); }
	public PozycjaZamowienia utworzPozycjeZamowienia(Produkt produkt, int ilosc) { return new PozycjaZamowienia(produkt, ilosc); }
}
