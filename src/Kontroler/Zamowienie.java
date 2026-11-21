package Kontroler;

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

	public int getId() {
		return this._id;
	}

	public void setId(int aId) {
		this._id = aId;
	}

	public String getStatus() {
		return this._status;
	}

	public void setStatus(String aStatus) {
		this._status = aStatus;
	}

	public Uzytkownik getKlient() {
		return this._klient;
	}

	public void setKlient(Uzytkownik aKlient) {
		this._klient = aKlient;
	}

	public String getEmail() {
		return this._email;
	}

	public void setEmail(String aEmail) {
		this._email = aEmail;
	}

	public Zamowienie() {
		throw new UnsupportedOperationException();
	}

	public void dodajPozycje(Produkt aProdukt) {
		throw new UnsupportedOperationException();
	}

	public List<PozycjaZamowienia> getPozycje() {
		return this._pozycje;
	}
}