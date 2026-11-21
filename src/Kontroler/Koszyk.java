package Kontroler;

public class Koszyk {
    private Produkt[] produkty;
    private double wartosc;

    public Koszyk() {
        this.produkty = new Produkt[0];
        this.wartosc = 0.0;
    }

    public Produkt[] getProdukty() {
        return produkty;
    }

    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty != null ? produkty : new Produkt[0];
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        if (produkt == null || ilosc <= 0) {
            return;
        }
        Produkt[] nowa = new Produkt[produkty.length + ilosc];
        System.arraycopy(produkty, 0, nowa, 0, produkty.length);
        for (int i = 0; i < ilosc; i++) {
            nowa[produkty.length + i] = produkt;
        }
        this.produkty = nowa;
        this.wartosc += produkt.getCena() * ilosc;
    }

    public void usunProdukt(int produktId) {
        if (produkty.length == 0) {
            return;
        }
        java.util.List<Produkt> pozostale = new java.util.ArrayList<>();
        double nowaWartosc = 0.0;
        for (Produkt p : produkty) {
            if (p.getIdProduktu() == produktId) {
                continue;
            }
            pozostale.add(p);
            nowaWartosc += p.getCena();
        }
        this.produkty = pozostale.toArray(new Produkt[0]);
        this.wartosc = nowaWartosc;
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
        double suma = 0.0;
        for (Produkt p : produkty) {
            if (p != null) {
                suma += p.getCena();
            }
        }
        this.wartosc = suma;
        return suma;
    }

    public boolean czyPusty() {
        return this.produkty.length == 0;
    }
}