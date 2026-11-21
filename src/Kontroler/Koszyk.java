package Kontroler;

import java.util.ArrayList;
import java.util.List;

public class Koszyk {
    private Produkt[] produkty;
    private double wartosc;
    private final List<PozycjaZamowienia> pozycje = new ArrayList<PozycjaZamowienia>();
    public Koszyk() {
        this.produkty = new Produkt[0]; // lub jakaś domyślna wielkość
        this.wartosc = 0.0;
    }

    public Produkt[] getProdukty() {
        return produkty;
    }

    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        // Tymczasowa, prosta implementacja (w kolejnym etapie można użyć listy)
        Produkt[] nowa = new Produkt[produkty.length + 1];
        System.arraycopy(produkty, 0, nowa, 0, produkty.length);
        nowa[produkty.length] = produkt;
        this.produkty = nowa;
    }

    public void usunProdukt(int produkt) {
        // Tymczasowo puste, do implementacji w kolejnym etapie
    }

    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }

    public void wyczysc() {
        this.produkty = new Produkt[0];
        this.wartosc = 0.0;
    }

    public double obliczLacznaCene() {
        // Tymczasowo zwraca zapisaną wartość
        return this.wartosc;
    }

    public boolean czyPusty() {
        return this.produkty.length == 0;
    }
    public List<PozycjaZamowienia> getPozycje() { return new ArrayList<PozycjaZamowienia>(pozycje); }
}