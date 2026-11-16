package Kontroler;

public interface IFabrykaEncji {

	public Produkt utworzProdukt(String aNazwa, double aCena);

	public Zamowienie utworzZamowienie();

	public Uzytkownik utworzUzytkownika(String aLogin, String aHaslo);

	public Koszyk utworzKoszyk();

	public PozycjaZamowienia utworzPozycjeZamowienia(Produkt aProdukt, int aIlosc);
}