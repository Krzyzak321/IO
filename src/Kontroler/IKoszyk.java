package Kontroler;
public interface IKoszyk {

	public void dodajProdukt(int aIdProduktu, int aIlosc);

	public Produkt[] pobierzZawartosc();

	public void usunProdukt(int aIdProduktu);

	public void wyczysc();

	public double obliczLacznaCene();
}