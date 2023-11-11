package BasicRecursion;

public class FibbonacciNum {
    public void fibb( int a,int b, int x) {

        if (x == 0) {
            return;
        }
        int c = a + b;
        System.out.println(a);
        fibb(b, c, x - 1);

    }
}
