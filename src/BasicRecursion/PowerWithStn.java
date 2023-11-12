package BasicRecursion;

public class PowerWithStn {
    public int powerStackn(int x, int n) {
//        if (n == 0) {
//            return 1;
//        }
//        if (x == 0) {
//            return 1;
//        }
//        return x * powerStackn(x, n - 1);

//        =====>logn
if(n==0){
    return 1;
}
if(n%2==0){
    System.out.println("mulgi");
    return powerStackn(x,n/2)*powerStackn(x,n/2);
}
else {
    System.out.println("odd");
    return x*powerStackn(x,n/2)*powerStackn(x,n/2);
}
    }
}
