package Kontroler;

public class ProduktZRabatem extends ProduktDekorator {
	protected double _rabat;

	public ProduktZRabatem(int aId, String aNazwa, double aCena, int aIlosc) {
		super(aId, aNazwa, aCena, aIlosc);
	}
}