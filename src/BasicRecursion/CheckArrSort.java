package BasicRecursion;

public class CheckArrSort {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{1, 2, 5, 4, 5};
        if (isSorted(arr, 0)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        } else if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }
}
