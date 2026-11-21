package Kontroler;

/**
 * Prosty punkt startowy aplikacji.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== URUCHOMIENIE SYSTEMU SKLEPU ROWEROWEGO ===");

        Produkt produkt = new Produkt(1, "Opona 29x2.25", 120.50, 10);
        Uzytkownik klient = new Uzytkownik(1, "jan_kowalski", "haslo123");

        System.out.println("Przykładowy produkt: " + produkt.getNazwa()
                + ", cena: " + produkt.getCena()
                + ", stan magazynowy: " + produkt.getStanMagazynowy());
        System.out.println("Przykładowy klient: " + klient.getLogin());
        System.out.println("=== SYSTEM URUCHOMIONY ===");
    }
}
