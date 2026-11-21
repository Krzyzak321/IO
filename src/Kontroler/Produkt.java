package Kontroler;

import java.util.Vector;

public class Produkt {
	private int _idProduktu;
	private String _nazwa;
	private double _cena;
	private int _stanMagazynowy;
	public Koszyk _unnamed_Koszyk_;
	public Vector<PozycjaZamowienia> _unnamed_PozycjaZamowienia_ = new Vector<PozycjaZamowienia>();

	public Produkt() {
	}

	public Produkt(int aId, String aNazwa, double aCena, int aIlosc) {
		if (aCena < 0 || aIlosc < 0) throw new IllegalArgumentException("Cena i stan nie mogą być ujemne");
		this._idProduktu = aId;
		this._nazwa = aNazwa;
		this._cena = aCena;
		this._stanMagazynowy = aIlosc;
	}

	public int getIdProduktu() { return this._idProduktu; }
	public void setIdProduktu(int aIdProduktu) { this._idProduktu = aIdProduktu; }
	public String getNazwa() { return this._nazwa; }
	public void setNazwa(String aNazwa) { this._nazwa = aNazwa; }
	public double getCena() { return this._cena; }
	public void setCena(double aCena) {
		if (aCena < 0) throw new IllegalArgumentException("Cena nie może być ujemna");
		this._cena = aCena;
	}
	public int getStanMagazynowy() { return this._stanMagazynowy; }
	public void setStanMagazynowy(int aStanMagazynowy) {
		if (aStanMagazynowy < 0) throw new IllegalArgumentException("Stan nie może być ujemny");
		this._stanMagazynowy = aStanMagazynowy;
	}
}
