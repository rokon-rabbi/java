package kattis;

import java.util.Scanner;

public class tarifa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int N = input.nextInt();
        double accumulatedData=X;
        for (int i=0; i<N;i++){
            int p =input.nextInt();
            accumulatedData += X-p;
        }
        System.out.println(accumulatedData);
    }
}
