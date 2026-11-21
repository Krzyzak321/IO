package Kontroler;

import java.util.Vector;

public class Uzytkownik {
	private int _id;
	private String _login;
	private String _haslo;
	private String _rola;
	private Uzytkownik _kozyk;
	private Zamowienie[] _historiaZamowien;
	public Vector<Zamowienie> _unnamed_Zamowienie_ = new Vector<Zamowienie>();
	public Koszyk _unnamed_Koszyk_;

	public Uzytkownik() { }

	public Uzytkownik(int aId, String aLogin, String aHaslo) {
		this._id = aId;
		this._login = aLogin;
		this._haslo = aHaslo;
		this._rola = "KLIENT";
		this._historiaZamowien = new Zamowienie[0];
	}

	public int getId() { return this._id; }
	public void setId(int aId) { this._id = aId; }
	public String getLogin() { return this._login; }
	public void setLogin(String aLogin) { this._login = aLogin; }
	public String getHaslo() { return this._haslo; }
	public void setHaslo(String aHaslo) { this._haslo = aHaslo; }
	public String getRola() { return this._rola; }
	public void setRola(String aRola) { this._rola = aRola; }
	public Uzytkownik getKozyk() { return this._kozyk; }
	public void setKozyk(Uzytkownik aKozyk) { this._kozyk = aKozyk; }
	public Zamowienie[] getHistoriaZamowien() { return this._historiaZamowien; }
	public void setHistoriaZamowien(Zamowienie[] aHistoriaZamowien) { this._historiaZamowien = aHistoriaZamowien; }
}
