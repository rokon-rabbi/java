package OOP1;

public class Main {
    public static void main(String[] args) {
//        Person rokon =new Person("rokon");
//        rokon.setWeight(59);
//        Person rafsan =new Person("rafsan");
//        rafsan.setWeight(70);
        SimpleDate date= new SimpleDate(16,11,1999);
        Person rokon =new Person("rokon",date);
        Person rafsan=new Person("rafsan",new SimpleDate(4,7,2009));
        if (rokon.olderThan(rafsan)) {  //  same as muhammad.olderThan(pascal)==true
            System.out.println(rokon.getName() + " is not older than " + rafsan.getName());
        } else {
            System.out.println(rokon.getName() + " is older than " + rafsan.getName());
        }




//
//        AmusementParkWeight waterTrack=new AmusementParkWeight("water Track", 60);
//        if(waterTrack.allowToRide(rokon)){
//            System.out.println("Rokon allow to ride");
//        }
//        else {
//            System.out.println("rokon not allowed");
//        }
//        if(waterTrack.allowToRide(rafsan)){
//            System.out.println("Rokon allow to ride");
//        }
//        else {
//            System.out.println("rafsan not allowed");
//        }



    }
}
