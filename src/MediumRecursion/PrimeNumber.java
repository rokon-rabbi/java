package MediumRecursion;

import java.util.Scanner;

public class PrimeNumber {
    public static void checkPrime(int n, int i) {

        if (n == 1) {
            System.out.println("Not prime Number");
            return;
        }
        if (n == 2) {
            System.out.println("prime Number");
            return;
        }
        if (n % i == 0) {
            System.out.println("Not prime Number");
            return;
        }
        if (i * i > n) {
            System.out.println("prime Number");
            return;
        }
        checkPrime(n, i + 1);

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        checkPrime(n, 2);
    }
}
