package Kontroler;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== URUCHOMIENIE SYSTEMU SKLEPU ROWEROWEGO ===");

        // --- KROK 1: Przygotowanie danych testowych (przez Fabrykę i DAO) ---
        IDAO dao = new DAO();
        IFabrykaEncji fabryka = new FabrykaSklepu();

        EncjaFasada fasadaModelu = new EncjaFasada(dao, fabryka);

        Produkt testowyProdukt = fabryka.utworzProdukt("Opona 29x2.25", 120.50);
        Uzytkownik testowyKlient = fabryka.utworzUzytkownika("jan_kowalski", "haslo123");

        // Zapisujemy produkt w DAO (na wypadek gdyby utworzProdukt go tam nie dodawał)
        if (dao.pobierzProdukt(testowyProdukt.getIdProduktu()) == null) {
            dao.zapiszProdukt(testowyProdukt);
        }

        System.out.println("Przygotowano dane testowe: " + testowyProdukt.getNazwa()
                + " (ID: " + testowyProdukt.getIdProduktu() + ", cena: " + testowyProdukt.getCena() + ")"
                + ", Klient: " + testowyKlient.getLogin());

        // --- KROK 2: Przygotowanie Kontrolera ---
        KontrolerKlienta kontrolerKlienta = new KontrolerKlienta(fasadaModelu);

        // --- KROK 3: Symulacja dodania produktu do koszyka i test Koszyk/EncjaFasada ---
        System.out.println("\n--- Dodawanie produktu do koszyka ---");
        fasadaModelu.dodajProdukt(testowyProdukt.getIdProduktu(), 2); // Dodajemy 2 sztuki

        Produkt[] zawartosc = fasadaModelu.pobierzZawartosc();
        System.out.println("Liczba sztuk w koszyku: " + zawartosc.length);
        for (int i = 0; i < zawartosc.length; i++) {
            System.out.println("  [" + (i + 1) + "] " + zawartosc[i].getNazwa() + " - " + zawartosc[i].getCena());
        }
        System.out.println("Łączna cena z koszyka: " + fasadaModelu.obliczLacznaCene());

        // --- KROK 4: Testowe wykonanie operacji przypadku użycia (PU05) ---
        System.out.println("\n--- Rozpoczynam testowe składanie zamówienia (PU05) ---");
        try {
            kontrolerKlienta.zlozZamowienie();
            System.out.println("Zamówienie złożone pomyślnie!");
        } catch (UnsupportedOperationException e) {
            // --- KROK 5: Obsługa wyjątku i wyświetlenie wyniku ---
            System.out.println("Przechwycono wyjątek: Funkcjonalność niezaimplementowana w tym etapie.");
            System.out.println("Szczegóły: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Wystąpił inny błąd: " + e.getMessage());
        }

        System.out.println("\n=== KONIEC TESTU ===");
    }
}