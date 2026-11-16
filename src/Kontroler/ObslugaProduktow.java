package Kontroler;


import java.util.List;

public class ObslugaProduktow {
	private IStrategiaFiltrowania _strategiaFiltrowania;
	public IProdukt _produkt;


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

	public void ustawSposobFiltrowania(IStrategiaFiltrowania aS) {
		throw new UnsupportedOperationException();
	}

	public List<Produkt> pobierzProdukty(String aKryterium) {
		throw new UnsupportedOperationException();
	}
}