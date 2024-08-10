package kattis;

import java.util.Scanner;

public class problems_99 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int price=input.nextInt();
        int output;
        int mod=price%100;

        if(price<99){
            output=99;
        }
        else if(99-mod==mod+1){
            output= price+(99-mod);
        }
        else if(99-mod<mod+1){
              output= price+(99-mod);
        }
        else {
            output=price-(mod+1);
        }
        System.out.println(output);
    }

}
