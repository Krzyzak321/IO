package Kontroler;



public class KontrolerAdministratora implements IKontrolerAdministratora {
	private IProdukt _produkt;
	private IZamowienie _zamowienie;
	private IKoszyk _koszyk;

	public KontrolerAdministratora(IProdukt aProdukt, IZamowienie aZamowienie, IKoszyk aKoszyk) {
		throw new UnsupportedOperationException();
	}

	public void zarzadzajUzytkownikami() {
		throw new UnsupportedOperationException();
	}

	public void dodajProdukt() {
		throw new UnsupportedOperationException();
	}

	public void usunProdukt(int aIdProduktu) {
		throw new UnsupportedOperationException();
	}

	public void zmienCeneProduktu(int aIdProduktu, double aNowaCena) {
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

	public void zaplac(String aEmail) {
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

	public void zaloguj(String aLogin, String aHaslo) {
		throw new UnsupportedOperationException();
	}

	public void zarejestruj() {
		throw new UnsupportedOperationException();
	}
}