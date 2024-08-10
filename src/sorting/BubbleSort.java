package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 6, 1, 7};
        int temp;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
            for (int k = 0; k <= arr.length - 1; k++) {
                System.out.print(arr[k]);
            }
            System.out.println();
        }


    }
}
