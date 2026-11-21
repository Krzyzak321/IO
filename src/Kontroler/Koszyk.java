package Kontroler;

public class Koszyk {
	private java.util.List<PozycjaZamowienia> pozycje = new java.util.ArrayList<PozycjaZamowienia>();

	public void dodajProdukt(Produkt produkt, int ilosc) {
		if (produkt == null || ilosc <= 0) {
			throw new IllegalArgumentException("Nieprawidłowy produkt lub ilość");
		}
		pozycje.add(new PozycjaZamowienia(produkt, ilosc));
	}

	public void usunProdukt(int idProduktu) {
		java.util.Iterator<PozycjaZamowienia> iterator = pozycje.iterator();
		while (iterator.hasNext()) {
			PozycjaZamowienia pozycja = iterator.next();
			if (pozycja.getProdukt() != null && pozycja.getProdukt().getIdProduktu() == idProduktu) {
				iterator.remove();
			}
		}
	}

	public java.util.List<PozycjaZamowienia> getPozycje() {
		return new java.util.ArrayList<PozycjaZamowienia>(pozycje);
	}

	public void wyczysc() {
		pozycje.clear();
	}
}
