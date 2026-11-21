package Kontroler;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Zamowienie {
	private int _id;
	private String _status;
	private Uzytkownik _klient;
	private String _email;
	private List<PozycjaZamowienia> _pozycje;
	public Uzytkownik _unnamed_Uzytkownik_;
	public Vector<PozycjaZamowienia> _unnamed_PozycjaZamowienia_ = new Vector<PozycjaZamowienia>();

	public Zamowienie() {
		this._status = "NOWE";
		this._pozycje = new ArrayList<PozycjaZamowienia>();
	}
	public Zamowienie(int id, Uzytkownik klient) {
		this();
		this._id = id;
		this._klient = klient;
	}
	public int getId() { return this._id; }
	public void setId(int aId) { this._id = aId; }
	public String getStatus() { return this._status; }
	public void setStatus(String aStatus) { this._status = aStatus; }
	public Uzytkownik getKlient() { return this._klient; }
	public void setKlient(Uzytkownik aKlient) { this._klient = aKlient; }
	public String getEmail() { return this._email; }
	public void setEmail(String aEmail) { this._email = aEmail; }
	public void setPozycje(List<PozycjaZamowienia> pozycje) {
		this._pozycje = pozycje == null ? new ArrayList<PozycjaZamowienia>() : new ArrayList<PozycjaZamowienia>(pozycje);
	}
	public List<PozycjaZamowienia> getPozycje() { return this._pozycje; }
	public void dodajPozycje(Produkt produkt) {
		if (produkt == null) throw new IllegalArgumentException("Produkt nie może być pusty");
		this._pozycje.add(new PozycjaZamowienia(produkt, 1));
	}
	public void dodajPozycje(PozycjaZamowienia pozycja) {
		if (pozycja == null) throw new IllegalArgumentException("Pozycja nie może być pusta");
		this._pozycje.add(pozycja);
	}
	public double obliczLacznaCene() {
		double suma = 0;
		for (PozycjaZamowienia p : _pozycje) suma += p.getCenaZakupu() * p.getIlosc();
		return suma;
	}
}
