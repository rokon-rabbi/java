package OOP1;

public class AmusementParkWeight {
    private String name;
    private int minimunWeight;
    public AmusementParkWeight(String name ,int minimunWeight){
        this.name=name;
        this.minimunWeight=minimunWeight;
    }
    public Boolean allowToRide(Person person){
        if(person.getWeight()>minimunWeight)
        {
         return    false;
        }
        return true;
    }
}
