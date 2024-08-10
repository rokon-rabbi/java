package kattis;

import java.util.Scanner;

public class qaly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Double QualityOfLife=0.0;
        for (int i = 0; i < n; i++) {
           Double  x = input.nextDouble();
           Double  y = input.nextDouble();
           QualityOfLife +=x*y;
        }
        System.out.println(QualityOfLife);

    }
}
