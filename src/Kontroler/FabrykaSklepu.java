package Kontroler;

public class FabrykaSklepu implements IFabrykaEncji {
	private static int nastIdProduktu = 1;
	private static int nastIdZamowienia = 1;
	private static int nastIdUzytkownika = 1;

	public Produkt utworzProdukt(String aNazwa, double aCena) {
		return new Produkt(nastIdProduktu++, aNazwa, aCena, 0);
	}

	public Zamowienie utworzZamowienie() {
		Zamowienie zamowienie = new Zamowienie();
		zamowienie.setId(nastIdZamowienia++);
		return zamowienie;
	}

	public Uzytkownik utworzUzytkownika(String aLogin, String aHaslo) {
		return new Uzytkownik(nastIdUzytkownika++, aLogin, aHaslo);
	}

	public Koszyk utworzKoszyk() {
		return new Koszyk();
	}

	public PozycjaZamowienia utworzPozycjeZamowienia(Produkt aProdukt, int aIlosc) {
		return new PozycjaZamowienia(aProdukt, aIlosc);
	}
}
