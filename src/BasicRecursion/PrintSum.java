package BasicRecursion;

public class PrintSum {
    public static void main(String[] args) {
        printSum(5,0);
    }
    public static void printSum(int x, int sum) {

        if (sum > 10) {

            return;
        }
        System.out.println(5+" X "+sum+" = "+ 5*sum);
        printSum(x, sum+1);
    }
}
