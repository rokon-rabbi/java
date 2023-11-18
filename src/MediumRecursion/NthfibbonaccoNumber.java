package MediumRecursion;

import java.util.Scanner;

public class NthfibbonaccoNumber {
    public static int FibbNth(int x) {
        if (x < 3) {
            return 1;
        }
        return FibbNth(x - 1) + FibbNth(x - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int result = FibbNth(x);
        System.out.println(result);

    }
}
