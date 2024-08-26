package Basic;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("rabbi");
        System.out.println(sb);
        StringBuilderReverse(sb);
//        Scanner sc = new Scanner(System.in);
//
//        String str = sc.nextLine();
//        NormalStringReverse(str);
    }

    public static void NormalStringReverse(String str) {
        String newStr = "";
        char cr;
        System.out.println("Your input string is : " + str);
        for (int i = 0; i < str.length(); i++) {

            cr = str.charAt(i);
            newStr = cr + newStr;
        }
        System.out.println("Reversed String is: " + newStr);
    }

    public static void StringBuilderReverse(StringBuilder sb) {
        String newStr = "";
        char cr;
        System.out.println("Your input string is : " + sb);
        for (int i = 0; i < sb.length() / 2; i++) {
            System.out.println(i);
            int front = i;
            int back = sb.length() - 1 - i;
            char frontcr = sb.charAt(front);
            char backcr = sb.charAt(back);
            sb.setCharAt(front, backcr);
            sb.setCharAt(back, frontcr);
        }
        System.out.println("Reversed String is: " + sb);
    }
}
