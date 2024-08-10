package kattis;

import java.util.Scanner;

public class different {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            long numberOne = input.nextLong();
            long numberTwo = input.nextLong();
            System.out.println(Math.abs(numberOne - numberTwo));
        }

        input.close();
    }
}
