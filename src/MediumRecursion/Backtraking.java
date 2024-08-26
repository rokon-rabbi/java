package MediumRecursion;

public class Backtraking {
    public static void main(String[] args) {
        int n = 3;
        char[] arr = new char[n];
        int index = 0;
        genarateString(arr, n, index);
    }

    public static void genarateString(char[] arr, int n, int index) {
        if (index == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
            return;
        }
        arr[index] = 'a';
        genarateString(arr, n, index + 1);
        arr[index] = 'b';
        genarateString(arr, n, index + 1);
        arr[index] = 'c';
        genarateString(arr, n, index + 1);


    }
}
