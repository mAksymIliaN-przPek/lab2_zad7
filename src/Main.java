import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ile liczb chcesz posortować? ");
        int n = scanner.nextInt();
        int[] liczby = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbę: ");
            liczby[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (liczby[j] > liczby[j + 1]) {

                    int temp = liczby[j];
                    liczby[j] = liczby[j + 1];
                    liczby[j + 1] = temp;
                }
            }
        }

        
        System.out.println("Posortowane liczby:");
        for (int i = 0; i < n; i++) {
            System.out.print(liczby[i] + " ");
        }
    }
}