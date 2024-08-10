package kattis;

import java.util.Scanner;

public class isithalloween {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String date = input.nextLine();
        if(date.matches("OCT 31") || date.matches("DEC 25")){
            System.out.println("yup");
        }
        else {
            System.out.println("nope");
        }

    }
}
