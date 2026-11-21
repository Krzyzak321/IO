package Kontroler;


public class Main {

    public static void main(String[] args) {
        System.out.println("=== URUCHOMIENIE SYSTEMU SKLEPU ROWEROWEGO ===");

        // --- KROK 1: Przygotowanie danych testowych ---
        // Tworzymy obiekty (zakładam, że masz konstruktory w klasach encji)
        Produkt testowyProdukt = new Produkt(1, "Opona 29x2.25", 120.50, 10);
        Uzytkownik testowyKlient = new Uzytkownik(1, "jan_kowalski", "haslo123");
        System.out.println("Przygotowano dane testowe: " + testowyProdukt.getNazwa() + ", Klient: " + testowyKlient.getLogin());

        // --- KROK 2: Przygotowanie klas i obiektów tworzących oprogramowanie ---
        // Tworzymy instancje klas z warstwy Model (baza, fabryka, fasada)
        IDAO dao = new DAO();
        IFabrykaEncji fabryka = new FabrykaSklepu();

        // Tworzymy Fasadę modelu (przekazujemy DAO i Fabrykę)
        EncjaFasada fasadaModelu = new EncjaFasada(dao, fabryka);

        // Tworzymy Kontroler (przekazujemy Fasadę modelu)
        KontrolerKlienta kontrolerKlienta = new KontrolerKlienta(fasadaModelu);

        // --- KROK 3: Testowe wykonanie operacji przypadku użycia ---
        System.out.println("\n--- Rozpoczynam testowe składanie zamówienia (PU05) ---");
        try {
            // Wywołujemy metodę z Fasady Kontrolera
            kontrolerKlienta.zlozZamowienie();

            System.out.println("Metoda zakończona (jeśli nie ma wyjątku, to dobrze).");
        } catch (UnsupportedOperationException e) {
            // --- KROK 4: Obsługa wyjątku i wyświetlenie wyniku ---
            System.out.println("Przechwycono wyjątek: Funkcjonalność niezaimplementowana w tym etapie.");
            System.out.println("Szczegóły: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Wystąpił inny błąd: " + e.getMessage());
        }

        System.out.println("\n=== KONIEC TESTU ===");
    }
}