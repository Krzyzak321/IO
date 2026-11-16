package Kontroler;

public interface IZamowienie {

	public int zapiszZamowienie(Zamowienie aZamowienie);

	public void zmienStatus(int aId, String aNowyStatus);

	public Zamowienie pobierzZamowienie(int aId);

	public Zamowienie[] pobierzZamowieniaKlienta(int aIdKlienta);
}