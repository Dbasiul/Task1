package lt.vcd;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Iveskite v: ");
        int v = scanner.nextInt();

        System.out.print("Iveskite n: ");
        int n = scanner.nextInt();

        // Knygu skaicius per metus padalintas is lankytoju
        double k = (v * 12.0) / n;

        System.out.println("Vidutiniskai knygu per metus: " + k);

        scanner.close();
    }
}
