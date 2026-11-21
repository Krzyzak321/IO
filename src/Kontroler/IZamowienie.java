package Kontroler;

public interface IZamowienie {

	public int zapiszZamowienie(Zamowienie aZamowienie);

	public void zmienStatus(int aId, String aNowyStatus);

	public Zamowienie pobierzZamowienie(int aId);

	public Zamowienie[] pobierzZamowieniaKlienta(int aIdKlienta);

	public int wezId();

	public String wezStatus();

	public double wezLacznaKwotee();

	public int wez();

	public void operation();

	public double wezLacznaKwote();
}