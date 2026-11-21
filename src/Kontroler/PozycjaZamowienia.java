package Kontroler;

public class PozycjaZamowienia {
	private int _ilosc;
	private double _cenaZakupu;
	private Produkt _produkt;
	public Zamowienie _unnamed_Zamowienie_;
	public Produkt _unnamed_Produkt_;

	public PozycjaZamowienia() { }
	public PozycjaZamowienia(Produkt produkt, int ilosc) {
		if (ilosc <= 0) throw new IllegalArgumentException("Ilość musi być większa od zera");
		this._produkt = produkt;
		this._ilosc = ilosc;
		this._cenaZakupu = produkt == null ? 0 : produkt.getCena();
	}
	public int getIlosc() { return this._ilosc; }
	public void setIlosc(int aIlosc) {
		if (aIlosc < 0) throw new IllegalArgumentException("Ilość nie może być ujemna");
		this._ilosc = aIlosc;
	}
	public double getCenaZakupu() { return this._cenaZakupu; }
	public void setCenaZakupu(double aCenaZakupu) { this._cenaZakupu = aCenaZakupu; }
	public Produkt getProdukt() { return this._produkt; }
	public void setProdukt(Produkt aProdukt) {
		this._produkt = aProdukt;
		if (aProdukt != null) this._cenaZakupu = aProdukt.getCena();
	}
	public void dodajProdukt(Produkt aProdukt) {
		if (aProdukt == null) throw new IllegalArgumentException("Produkt nie może być pusty");
		this._produkt = aProdukt;
		this._ilosc++;
		this._cenaZakupu = aProdukt.getCena();
	}
	public void usunProdukt(Produkt aProdukt) {
		if (_produkt == aProdukt && _ilosc > 0) _ilosc--;
	}
}
