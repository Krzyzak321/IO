package Kontroler;

public interface IDAO {

	public void zapiszProdukt(Produkt aProdukt);

	public Produkt pobierzProdukt(int aId);

	public Produkt[] pobierzWszystkieProdukty();

	public void zaktualizujProdukt(Produkt aProdukt);

	public void usunProdukt(int aId);

	public void zapiszZamowienie(Zamowienie aZamowienie);

	public Zamowienie pobierzZamowienie(int aId);

	public Zamowienie[] pobierzZamowieniaKlienta(int aIdKlienta);

	public void zaktualizujZamowienie(Zamowienie aZamowienie);

	public void usunZamowienie(int aIdZamowienia);

	public void zapiszKoszyk(Koszyk aKoszyk);

	public Koszyk pobierzKoszyk(int aId);

	public void zaktualizujKoszyk(Koszyk aKoszyk);

	public void usunKoszyk(int aId);

	public void zapiszUzytkownika(Uzytkownik aUzytkownik);

	public Uzytkownik pobierzUzytkownika(String aLogin);

	public void zaktualizujUzytkownika(Uzytkownik aUzytkownik);

	public void usunUzytkownika(int aId);
}