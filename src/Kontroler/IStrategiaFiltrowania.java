package Kontroler;

import java.util.List;

public interface IStrategiaFiltrowania {

	public List<Produkt> filtruj(List<Produkt> aProdukty, String aKryterium);
}