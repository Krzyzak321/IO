package Kontroler;

import java.util.ArrayList;
import java.util.List;

/** In-memory cart implementation; Koszyk remains an interface for compatibility. */
public class KoszykSklepu implements Koszyk {
	private final List<PozycjaZamowienia> pozycje = new ArrayList<PozycjaZamowienia>();
	public void dodaj(Produkt produkt, int ilosc) {
		if (produkt == null || ilosc <= 0) throw new IllegalArgumentException("Nieprawidłowy produkt lub ilość");
		for (PozycjaZamowienia p : pozycje) {
			if (p.getProdukt() != null && p.getProdukt().getIdProduktu() == produkt.getIdProduktu()) { p.setIlosc(p.getIlosc() + ilosc); return; }
		}
		pozycje.add(new PozycjaZamowienia(produkt, ilosc));
	}
	public List<PozycjaZamowienia> getPozycje() { return new ArrayList<PozycjaZamowienia>(pozycje); }
	public void wyczysc() { pozycje.clear(); }
	public void usun(int id) { for (int i = pozycje.size() - 1; i >= 0; i--) if (pozycje.get(i).getProdukt() != null && pozycje.get(i).getProdukt().getIdProduktu() == id) pozycje.remove(i); }
}
