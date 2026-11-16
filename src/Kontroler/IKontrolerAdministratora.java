package Kontroler;

public interface IKontrolerAdministratora extends IKontrolerKlienta {

	public void zarzadzajUzytkownikami();

	public void dodajProdukt();

	public void usunProdukt(int aIdProduktu);

	public void zmienCeneProduktu(int aIdProduktu, double aNowaCena);
}