package MediumRecursion;

public class RemoveOdd {
    public static void removeOdd(int[] arr, int currentIndex, int size) {
        if (currentIndex >= size) {
            return;
        }

        // If the current element is odd, shift the array to remove it
        if (arr[currentIndex] % 2 != 0) {
            for (int i = currentIndex; i < size - 1; i++) {
                arr[i] = arr[i + 1];
                System.out.println(arr[i]);

            }
            size--; // Decrease the size of the array
            arr[size] = 0; // Set the last element to 0
        } else {
            currentIndex++;
        }

        // Recursive call with updated indices and size
        removeOdd(arr, currentIndex, size);
    }

    public static void main(String[] args) {
        int[] arr = {1, 54, 88, 6, 55, 7};
        removeOdd(arr, 0, arr.length);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
