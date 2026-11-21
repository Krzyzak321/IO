package Kontroler;

import java.util.ArrayList;
import java.util.List;

public class EncjaFasada implements IProdukt, IZamowienie, IKoszyk {
	private final IFabrykaEncji _fabryka;
	private final IDAO _dao;
	private final Koszyk _koszyk;
	private Zamowienie _aktywneZamowienie;

	public EncjaFasada(IDAO dao, IFabrykaEncji fabryka) {
		if (dao == null || fabryka == null) throw new IllegalArgumentException("DAO i fabryka są wymagane");
		this._dao = dao; this._fabryka = fabryka; this._koszyk = new Koszyk();
	}
	public int zapiszZamowienie(Zamowienie z) {
		if (z == null) throw new IllegalArgumentException("Zamówienie nie może być puste");
		if (z.getId() == 0) z.setId(_dao.pobierzZamowieniaKlienta(z.getKlient() == null ? -1 : z.getKlient().getId()).length + 1);
		_dao.zapiszZamowienie(z); _aktywneZamowienie = z; return z.getId();
	}
	public void zmienStatus(int id, String status) { Zamowienie z = _dao.pobierzZamowienie(id); if (z != null) { z.setStatus(status); _dao.zaktualizujZamowienie(z); } }
	public Zamowienie pobierzZamowienie(int id) { return _dao.pobierzZamowienie(id); }
	public Zamowienie[] pobierzZamowieniaKlienta(int id) { return _dao.pobierzZamowieniaKlienta(id); }
	public void dodajProdukt(int id, int ilosc) {
		if (ilosc <= 0) throw new IllegalArgumentException("Ilość musi być większa od zera");
		Produkt p = pobierzProdukt(id); if (p == null) throw new IllegalArgumentException("Nie znaleziono produktu: " + id);
		if (!czyDostepny(id, ilosc)) throw new IllegalArgumentException("Brak wymaganej ilości w magazynie");
		_koszyk.dodajProdukt(p, ilosc);
	}
	public Produkt[] pobierzZawartosc() { List<Produkt> out = new ArrayList<Produkt>(); for (PozycjaZamowienia p : _koszyk.getPozycje()) out.add(p.getProdukt()); return out.toArray(new Produkt[out.size()]); }
	public void usunProdukt(int id) { _koszyk.usunProdukt(id); }
	public void wyczysc() { _koszyk.wyczysc(); }
	public double obliczLacznaCene() { double suma = 0; for (PozycjaZamowienia p : _koszyk.getPozycje()) suma += p.getCenaZakupu() * p.getIlosc(); return suma; }
	public Produkt[] pobierzWszystkie() { return _dao.pobierzWszystkieProdukty(); }
	public Produkt pobierzProdukt(int id) { return _dao.pobierzProdukt(id); }
	public boolean czyDostepny(int id, int ilosc) { Produkt p = pobierzProdukt(id); return p != null && ilosc >= 0 && p.getStanMagazynowy() >= ilosc; }
	public void zmniejszStan(int id, int ilosc) { Produkt p = pobierzProdukt(id); if (p == null || ilosc < 0 || p.getStanMagazynowy() < ilosc) throw new IllegalArgumentException("Nieprawidłowy stan produktu"); p.setStanMagazynowy(p.getStanMagazynowy() - ilosc); _dao.zaktualizujProdukt(p); }
	public void dodajProdukt(String nazwa, double cena) { _dao.zapiszProdukt(_fabryka.utworzProdukt(nazwa, cena)); }
	public void usunProdukt(int id, boolean zMagazynu) { _dao.usunProdukt(id); }
	public void zmienCene(int id, double cena) { Produkt p = pobierzProdukt(id); if (p == null) throw new IllegalArgumentException("Nie znaleziono produktu"); p.setCena(cena); _dao.zaktualizujProdukt(p); }
	public void dodajStan(int id, int ilosc) { Produkt p = pobierzProdukt(id); if (p == null || ilosc < 0) throw new IllegalArgumentException("Nieprawidłowy produkt lub ilość"); p.setStanMagazynowy(p.getStanMagazynowy() + ilosc); _dao.zaktualizujProdukt(p); }
	public void usunStan(int id, int ilosc) { zmniejszStan(id, ilosc); }
	public Produkt pobierzProduktZRabatem(int id, double rabat) { Produkt p = pobierzProdukt(id); if (p == null) return null; if (rabat < 0 || rabat > 1) throw new IllegalArgumentException("Rabat musi być z zakresu 0..1"); return new Produkt(p.getIdProduktu(), p.getNazwa(), p.getCena() * (1-rabat), p.getStanMagazynowy()); }
	public void usunProdukt() { if (_aktywneZamowienie != null) _dao.usunZamowienie(_aktywneZamowienie.getId()); }
	public int wezId() { return _aktywneZamowienie == null ? 0 : _aktywneZamowienie.getId(); }
	public String wezStatus() { return _aktywneZamowienie == null ? "BRAK" : _aktywneZamowienie.getStatus(); }
	public double wezLacznaKwotee() { return obliczLacznaCene(); }
	public int wez() { return wezId(); }
	public void operation() { }
	public double wezLacznaKwote() { return obliczLacznaCene(); }
}
