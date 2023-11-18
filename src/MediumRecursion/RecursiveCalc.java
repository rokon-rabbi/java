package MediumRecursion;

public class RecursiveCalc {
    public static int recusiveCalc(int x, int n,int curr){
        if (curr == n) {
            System.out.println((int)Math.pow(x, curr));
            return (int) Math.pow(x, curr-1 );
        }
        System.out.println((curr + 1) + " " + (curr + 1));

        return (int) Math.pow(x, curr-1) + recusiveCalc(x, n, curr + 1);


    }
    public static void main(String[] args) {
        System.out.println(recusiveCalc(2,5,0));
    }
}
