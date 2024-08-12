package Searching;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {3, 7, 5, 9, 5, 6, 2, 1};

        System.out.print("Enter the number to search: ");
        int number = scanner.nextInt();

        int index = linearSearch(arr, number);

        if (index != -1) {
            System.out.println("Number " + number + " is found at index " + index);
        } else {
            System.out.println("Number " + number + " is not found in the array.");
        }

        scanner.close();
    }


    public static int linearSearch(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i; // Return index if number is found
            }
        }
        return -1; // Return -1 if number is not found
    }
}
