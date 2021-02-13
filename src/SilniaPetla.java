import java.util.Scanner;

public class SilniaPetla {
    public static void main(String[] args) {
        /*
         *
         * Silnia
         * 5! = 5 * 4 * 3 * 2 * 1
         *
         * */

        System.out.println("Podaj ile silnia: ");
        Scanner scanner = new Scanner((System.in));
        int liczba = scanner.nextInt();

        int wynik = silniaPetla(liczba);
        System.out.println(wynik);
    }

    private static int silniaPetla(int liczba) {
        int wynik = 1;
        for (int i = liczba; i > 2; i--) {
            wynik = wynik * i;
        }

        return wynik;
    }

}
