package Kontroler;

import java.util.Vector;

public class Zamowienie {
	private int _id;
	private String _status;
	private Uzytkownik _klient;
	private String _email;
	public Uzytkownik _unnamed_Uzytkownik_;
	public Vector<PozycjaZamowienia> _unnamed_PozycjaZamowienia_ = new Vector<PozycjaZamowienia>();

	public Zamowienie() {
		this._status = "NOWE";
	}

	public Zamowienie(int id, Uzytkownik klient) {
		this._id = id;
		this._klient = klient;
		this._status = "NOWE";
	}

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

	public Vector<PozycjaZamowienia> getPozycje() {
		return this._unnamed_PozycjaZamowienia_;
	}

	public void dodajPozycje(PozycjaZamowienia pozycja) {
		if (pozycja != null) {
			this._unnamed_PozycjaZamowienia_.add(pozycja);
		}
	}
}
