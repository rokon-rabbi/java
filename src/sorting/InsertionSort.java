package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 8, 6, 1, 7, 9};
        int temp, i, k, j;

//        for (i = 1; i <= arr.length - 1; i++) {
//            temp = arr[i];
//            j = i - 1;
//            while (j >= 0 && arr[j] > temp) {
//                arr[j + 1] = arr[j];
//                j--;
//            }
////            System.out.println(j);
//            arr[j + 1] = temp;
//            for (k = 0; k < arr.length; k++) {
//
//                System.out.print(arr[k]);
//
//            }
//            System.out.println();
//        }

        for (i = 1; i <= arr.length - 1; i++) {
            temp = arr[i];

            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) {
                    System.out.println(temp);
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
//            arr[j+1]=temp;

            for (k = 0; k <= arr.length - 1; k++) {
                System.out.print(arr[k]);
            }
            System.out.println();
        }

    }
}
