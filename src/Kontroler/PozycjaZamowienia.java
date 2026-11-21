package Kontroler;

public class PozycjaZamowienia {
	private int _ilosc;
	private double _cenaZakupu;
	private Produkt _produkt;
	public Zamowienie _unnamed_Zamowienie_;
	public Produkt _unnamed_Produkt_;

	public int getIlosc() {
		return this._ilosc;
	}

	public void setIlosc(int aIlosc) {
		this._ilosc = aIlosc;
	}

	public double getCenaZakupu() {
		return this._cenaZakupu;
	}

	public void setCenaZakupu(double aCenaZakupu) {
		this._cenaZakupu = aCenaZakupu;
	}

	public Produkt getProdukt() {
		return this._produkt;
	}

	public void setProdukt(Produkt aProdukt) {
		this._produkt = aProdukt;
	}

	public void dodajProdukt(Produkt aProdukt) {
		throw new UnsupportedOperationException();
	}

	public void usunProdukt(Produkt aProdukt) {
		throw new UnsupportedOperationException();
	}

	public PozycjaZamowienia() {
		throw new UnsupportedOperationException();
	}
}