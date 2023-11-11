package BasicRecursion;

public class PrintSum {
    public void printSum(int x, int sum) {

        if (x == 0) {
            System.out.println(sum);
            return;
        }
        sum += x;
        printSum(x - 1, sum);
    }
}
