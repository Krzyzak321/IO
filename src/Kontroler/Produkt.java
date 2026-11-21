package Kontroler;

import java.util.Vector;

public class Produkt {
	private int _idProduktu;
	private String _nazwa;
	private double _cena;
	private int _stanMagazynowy;
	public Koszyk _unnamed_Koszyk_;
	public Vector<PozycjaZamowienia> _unnamed_PozycjaZamowienia_ = new Vector<PozycjaZamowienia>();

	public int getIdProduktu() {
		return this._idProduktu;
	}

	public void setIdProduktu(int aIdProduktu) {
		this._idProduktu = aIdProduktu;
	}

	public String getNazwa() {
		return this._nazwa;
	}

	public void setNazwa(String aNazwa) {
		this._nazwa = aNazwa;
	}

	public double getCena() {
		return this._cena;
	}

	public void setCena(double aCena) {
		this._cena = aCena;
	}

	public int getStanMagazynowy() {
		return this._stanMagazynowy;
	}

	public void setStanMagazynowy(int aStanMagazynowy) {
		this._stanMagazynowy = aStanMagazynowy;
	}

	public Produkt(int aId, String aNazwa, double aCena, int aIlosc) {
		this._idProduktu = aId;
		this._nazwa = aNazwa;
		this._cena = aCena;
		this._stanMagazynowy = aIlosc;
	}
}
