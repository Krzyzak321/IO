package Kontroler;

import java.util.ArrayList;
import java.util.List;

public class DAO implements IDAO {
	private final List<Produkt> produkty = new ArrayList<Produkt>();
	private final List<Zamowienie> zamowienia = new ArrayList<Zamowienie>();
	private final List<Koszyk> koszyki = new ArrayList<Koszyk>();
	private final List<Uzytkownik> uzytkownicy = new ArrayList<Uzytkownik>();

	public DAO() { }
	public synchronized void zapiszProdukt(Produkt p) { if (p != null) { usunProdukt(p.getIdProduktu()); produkty.add(p); } }
	public synchronized Produkt pobierzProdukt(int id) { for (Produkt p : produkty) if (p.getIdProduktu() == id) return p; return null; }
	public synchronized Produkt[] pobierzWszystkieProdukty() { return produkty.toArray(new Produkt[produkty.size()]); }
	public synchronized void zaktualizujProdukt(Produkt p) { if (p != null) { usunProdukt(p.getIdProduktu()); produkty.add(p); } }
	public synchronized void usunProdukt(int id) { for (int i = produkty.size() - 1; i >= 0; i--) if (produkty.get(i).getIdProduktu() == id) produkty.remove(i); }
	public synchronized void zapiszZamowienie(Zamowienie z) { if (z != null) { usunZamowienie(z.getId()); zamowienia.add(z); } }
	public synchronized Zamowienie pobierzZamowienie(int id) { for (Zamowienie z : zamowienia) if (z.getId() == id) return z; return null; }
	public synchronized Zamowienie[] pobierzZamowieniaKlienta(int id) {
		List<Zamowienie> wynik = new ArrayList<Zamowienie>();
		for (Zamowienie z : zamowienia) if (z.getKlient() != null && z.getKlient().getId() == id) wynik.add(z);
		return wynik.toArray(new Zamowienie[wynik.size()]);
	}
	public synchronized void zaktualizujZamowienie(Zamowienie z) { zapiszZamowienie(z); }
	public synchronized void usunZamowienie(int id) { for (int i = zamowienia.size() - 1; i >= 0; i--) if (zamowienia.get(i).getId() == id) zamowienia.remove(i); }
	public synchronized void zapiszKoszyk(Koszyk k) { if (k != null && !koszyki.contains(k)) koszyki.add(k); }
	public synchronized Koszyk pobierzKoszyk(int id) { return id >= 0 && id < koszyki.size() ? koszyki.get(id) : null; }
	public synchronized void zaktualizujKoszyk(Koszyk k) { zapiszKoszyk(k); }
	public synchronized void usunKoszyk(int id) { if (id >= 0 && id < koszyki.size()) koszyki.remove(id); }
	public synchronized void zapiszUzytkownika(Uzytkownik u) { if (u != null) { usunUzytkownika(u.getId()); uzytkownicy.add(u); } }
	public synchronized Uzytkownik pobierzUzytkownika(String login) { for (Uzytkownik u : uzytkownicy) if (login != null && login.equals(u.getLogin())) return u; return null; }
	public synchronized void zaktualizujUzytkownika(Uzytkownik u) { zapiszUzytkownika(u); }
	public synchronized void usunUzytkownika(int id) { for (int i = uzytkownicy.size() - 1; i >= 0; i--) if (uzytkownicy.get(i).getId() == id) uzytkownicy.remove(i); }
}
