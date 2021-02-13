import java.util.Scanner;

public class SilniaRekurencyjnie {
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

        int wynik = silnia(liczba);
        System.out.println(wynik);
    }

    private static int silnia(int liczba) {
        if(liczba < 2) {
            return 1;
        } else {
            return liczba * silnia(liczba - 1);
        }
    }

}