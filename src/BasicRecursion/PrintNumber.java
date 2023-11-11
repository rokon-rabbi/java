package BasicRecursion;

public class PrintNumber {
    public  void  PrintNumber(int x){
        if(x==0){
            return;
        }
        System.out.println(x);
        PrintNumber(x-1);
    }
}
