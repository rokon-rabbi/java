package sorting;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {9, 4, 6, 3, 2, 8, 1, 5, 7};
        mergeSort(arr);

        // Print the sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // Method to perform merge sort
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return; // Base case: if the array has less than 2 elements, it's already sorted
        }

        int mid = arr.length / 2;

        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Copy the left half into the left array
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
            System.out.println(left[i]);
        }
        // Copy the right half into the right array
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        // Recursively sort the left and right halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(arr, left, right);
    }

    // Method to merge two sorted arrays
    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the left and right arrays back into the original array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy any remaining elements from the left array
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy any remaining elements from the right array
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
