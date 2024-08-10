package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 6, 1, 7};
        int temp;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
            for (int k = 0; k <= arr.length - 1; k++) {
                System.out.print(arr[k]);
            }
            System.out.println();
        }


    }
}
