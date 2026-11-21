package Kontroler;

public interface IProdukt {

	public Produkt[] pobierzWszystkie();

	public Produkt pobierzProdukt(int aId);

	public boolean czyDostepny(int aId, int aIlosc);

	public void zmniejszStan(int aId, int aIlosc);

	public void dodajProdukt(String aNazwa, double aCena);

	public void usunProdukt(int aId);

	public void zmienCene(int aId, double aNowaCena);

	public void dodajStan(int aId, int aIlosc);

	public void usunStan(int aId, int aIlosc);
}