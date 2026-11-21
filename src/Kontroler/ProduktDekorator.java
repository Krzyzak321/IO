package Kontroler;

public class ProduktDekorator extends Produkt {
	protected Produkt _produkt;

	public ProduktDekorator(int aId, String aNazwa, double aCena, int aIlosc) {
		super(aId, aNazwa, aCena, aIlosc);
	}
}