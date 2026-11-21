package Kontroler;

public interface IKontrolerMagazyniera {

	public void sprawdzStanMagazynowy();

	public void sprawdzDostepnosc(int aIdProduktu);

	public void dodajStan(int aIdProduktu, int aIlosc);

	public void usunStan(int aIdProduktu, int aIlosc);
}