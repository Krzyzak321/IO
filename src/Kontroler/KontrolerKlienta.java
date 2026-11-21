package Kontroler;


/**
 * adddd
 */
public class KontrolerKlienta implements IKontrolerKlienta {
	private IProdukt _produkt;
	private IZamowienie _zamowienie;
	private IKoszyk _koszyk;
	private ObslugaZamowien _obslugaZamowien;

	public KontrolerKlienta(IProdukt aProdukt, IZamowienie aZamowienie, IKoszyk aKoszyk) {
		throw new UnsupportedOperationException();
	}

	public void przegladajOferte() {
		throw new UnsupportedOperationException();
	}

	public void dodajDoKoszyka(int aIdProduktu, int aIlosc) {
		throw new UnsupportedOperationException();
	}

	public void zlozZamowienie() {
		throw new UnsupportedOperationException();
	}

	public void anulujZamowienie(int aIdZamowienia) {
		throw new UnsupportedOperationException();
	}

	public boolean zaplac(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public void wyswietlHistorie() {
		throw new UnsupportedOperationException();
	}

	public void zglosZwrot(int aIdZamowienia) {
		throw new UnsupportedOperationException();
	}

	public void zglosReklamacje(int aIdZamowienia) {
		throw new UnsupportedOperationException();
	}

	public KontrolerKlienta(EncjaFasada aFasadaModelu) {
		throw new UnsupportedOperationException();
	}

	public void wyswietlPotwierdzenie(int aNumerZamowienia) {
		throw new UnsupportedOperationException();
	}

	public KontrolerKlienta(ObslugaZamowien aObZamowien, ObslugaProduktow aObProduktow) {
		throw new UnsupportedOperationException();
	}

	public void zaloguj(String aLogin, String aHaslo) {
		throw new UnsupportedOperationException();
	}

	public void zarejestruj() {
		throw new UnsupportedOperationException();
	}
}