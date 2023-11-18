package MediumRecursion;

public class PrintReverseArray {
    public static void reverseArray(int[] arr,int start, int index) {
//        if (index == 0) {
//            System.out.print(arr[0] + " ");
//            return;
//        }
//        System.out.print(arr[index] + " ");
//        reverseArray(arr, index - 1);
//        eith 0,n-1,1,n-2 order
       int  last=index;
       if(start>last){
           return;
       }
        System.out.println(arr[start]+" "+arr[last]);

reverseArray(arr,start+1,last-1);
    }

    public static void main(String[] args) {
        int[] arr = {1 ,5, 7, 8, 9};
        reverseArray(arr, 0,arr.length - 1);
    }
}
