package Kontroler;

import java.util.List;

public interface IDAO {

	// --- Operacje na Produktach ---
	void zapiszProdukt(Produkt aProdukt);
	Produkt pobierzProdukt(int aId);
	List<Produkt> pobierzWszystkieProdukty();
	void zaktualizujProdukt(Produkt aProdukt);
	void usunProdukt(int aId);

	// --- Operacje na Zamówieniach ---
	void zapiszZamowienie(Zamowienie aZamowienie);
	Zamowienie pobierzZamowienie(int aId);
	List<Zamowienie> pobierzZamowieniaKlienta(int aIdKlienta);
	void zaktualizujZamowienie(Zamowienie aZamowienie);

	// --- Operacje na Koszykach ---
	void zapiszKoszyk(Koszyk aKoszyk);
	Koszyk pobierzKoszyk(int aId);
	void zaktualizujKoszyk(Koszyk aKoszyk);
	void usunKoszyk(int aId);

	// --- Operacje na Użytkownikach ---
	void zapiszUzytkownika(Uzytkownik aUzytkownik);
	Uzytkownik pobierzUzytkownika(String aLogin);
	void zaktualizujUzytkownika(Uzytkownik aUzytkownik);
	void usunUzytkownika(int aId);
}