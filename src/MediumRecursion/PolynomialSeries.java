package MediumRecursion;

import java.util.Scanner;

public class PolynomialSeries {
    static void printPolynomial(int n, int currentTerm) {
        if (currentTerm == n) {
            System.out.print("x^" + (currentTerm - 1));
            return;
        }

        if (currentTerm == 0) {
            System.out.print("1");
        } else {
            System.out.print(" + x^" + (currentTerm - 1));
        }

        printPolynomial(n, currentTerm + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = scanner.nextInt();

        System.out.print("Output: ");
        printPolynomial(n, 0);

        scanner.close();
    }
}

