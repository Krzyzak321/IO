package Kontroler;
public class EncjaFasada implements IProdukt, IZamowienie, IKoszyk {
	private IFabrykaEncji _fabryka;
	private IDAO _dao;

	public int zapiszZamowienie(Zamowienie aZamowienie) {
		throw new UnsupportedOperationException();
	}

	public void zmienStatus(int aId, String aNowyStatus) {
		throw new UnsupportedOperationException();
	}

	public Zamowienie pobierzZamowienie(int aId) {
		throw new UnsupportedOperationException();
	}

	public Zamowienie[] pobierzZamowieniaKlienta(int aIdKlienta) {
		throw new UnsupportedOperationException();
	}

	public void dodajProdukt(int aIdProduktu, int aIlosc) {
		throw new UnsupportedOperationException();
	}

	public Produkt[] pobierzZawartosc() {
		throw new UnsupportedOperationException();
	}

	public void usunProdukt(int aIdProduktu) {
		throw new UnsupportedOperationException();
	}

	public void wyczysc() {
		throw new UnsupportedOperationException();
	}

	public Produkt[] pobierzWszystkie() {
		throw new UnsupportedOperationException();
	}

	public Produkt pobierzProdukt(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean czyDostepny(int aId, int aIlosc) {
		throw new UnsupportedOperationException();
	}

	public void zmniejszStan(int aId, int aIlosc) {
		throw new UnsupportedOperationException();
	}

	public void dodajProdukt(String aNazwa, double aCena) {
		throw new UnsupportedOperationException();
	}

	public void usunProdukt() {
		throw new UnsupportedOperationException();
	}

	public void zmienCene(int aId, double aNowaCena) {
		throw new UnsupportedOperationException();
	}

	public void dodajStan(int aId, int aIlosc) {
		throw new UnsupportedOperationException();
	}

	public void usunStan(int aId, int aIlosc) {
		throw new UnsupportedOperationException();
	}

	public Produkt pobierzProduktZRabatem(int aIdProduktu, double aRabat) {
		throw new UnsupportedOperationException();
	}

	public EncjaFasada(IDAO aDao, IFabrykaEncji aFabryka) {
		throw new UnsupportedOperationException();
	}

	public int wezId() {
		throw new UnsupportedOperationException();
	}

	public String wezStatus() {
		throw new UnsupportedOperationException();
	}

	public double wezLacznaKwotee() {
		throw new UnsupportedOperationException();
	}

	public int wez() {
		throw new UnsupportedOperationException();
	}

	public void operation() {
		throw new UnsupportedOperationException();
	}

	public double wezLacznaKwote() {
		throw new UnsupportedOperationException();
	}

	public double obliczLacznaCene() {
		throw new UnsupportedOperationException();
	}
}