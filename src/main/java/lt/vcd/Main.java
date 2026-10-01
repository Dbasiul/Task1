package lt.vcd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Įveskite vidutinį per mėnesį perskaitytų knygų skaičių (v): ");
        int v = scanner.nextInt();

        System.out.print("Įveskite vidutinį bibliotekos lankytojų skaičių per metus (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Klaida: lankytojų skaičius turi būti didesnis už 0.");
        } else {
            double k = (double) (v * 12) / n;
            System.out.printf("Vidutinis knygų skaičius, kurį per metus perskaito vienas lankytojas (k): %.2f%n", k);
        }

        scanner.close();
    }
}

