package BasicRecursion;

public class StarPrint {
    public static void main(String[] args) {
//        type:1
        int input = 4;
//        for (int i = 0; i < input; i++) {
//            for(int j=0; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
        //        -------------------------------------?
//        type:2
//        for(int i=input; i>=0;i--){
//            for(int j=0; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        -------------------------------------?
//        type:3

//        for (int i = 0; i < input; i++) {
//            for (int j = 0; j < input - i; j++) {
//
//
//                System.out.print(" ");
//
//            }
//            for (int k = 0; k <= i * 2; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //        -------------------------------------?
//        type:3

//        for (int i = input; i >= 0; i--) {
//            for (int j = 0; j < input - i; j++) {
//
//                System.out.print(" ");
//
//            }
//            for (int k = 0; k <= i * 2; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        String str = "rokon";
//
//        boolean status = Pal(str);
//        System.out.println(status);

//for(int i=str.length()-1;i>=0;i--){
//    System.out.println(str.charAt(i));
//}



    }

    public static boolean Pal(String str) {
        int len = str.length() - 1;
        for (int i = 0; i <= len; i++) {
//            System.out.println(str.charAt(i) + "=" + str.charAt(len--));
            if (str.charAt(i) != str.charAt(len--)) {

                return false;
            }

        }
        return true;
    }
}
