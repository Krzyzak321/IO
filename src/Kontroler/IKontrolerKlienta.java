package Kontroler;

/**
 * adddd
 */
public interface IKontrolerKlienta extends IKontrolerGoscia {

	public void przegladajOferte();

	public void dodajDoKoszyka(int aIdProduktu, int aIlosc);

	public void zlozZamowienie();

	public boolean zaplac(String aEmail);

	public void wyswietlHistorie();

	public void zglosZwrot(int aIdZamowienia);

	public void zglosReklamacje(int aIdZamowienia);
}