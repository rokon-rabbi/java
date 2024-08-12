package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = scanner.nextInt();
        int index = binarySearch(arr, number);
        System.out.println(1 / 2);
        if (index != -1) {
            System.out.println("Number " + number + " is found at index " + index);
        } else {
            System.out.println("Number " + number + " is not found in the array.");
        }
    }

    public static int binarySearch(int[] arr, int number) {
        int first = 0;
        int last = arr.length - 1;
        int i;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == number) {
                return mid;
            } else if (number > arr[mid]) {
                first = mid + 1;

            } else {
                last = mid - 1;
            }

        }
        return -1;


    }
}
