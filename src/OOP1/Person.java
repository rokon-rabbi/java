package OOP1;

public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;
    private SimpleDate birthDate;
    public Person(String name) {
        this.name=name;
    }
    public Person(String name,SimpleDate date) {
        this.name=name;
        this.birthDate=date;
    }

    public SimpleDate getBirthday() {
        return birthDate;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public boolean olderThan(Person compared){
        int ownYear = this.getBirthday().getYear();
        int comparedYear = compared.getBirthday().getYear();

        if (ownYear < comparedYear) {
            System.out.println("year");
            return true;
        }

        if (ownYear > comparedYear) {
            System.out.println("year");
            return false;
        }

        // 2. Same birthyear, compare months
        int ownMonth = this.getBirthday().getMonth();
        int comparedMonth = compared.getBirthday().getMonth();

        if (ownMonth < comparedMonth) {
            System.out.println("month");
            return true;
        }

        if (ownMonth > comparedMonth) {
            System.out.println("month");
            return false;
        }

        // 3. Same birth year and month, compare days
        int ownDay = this.getBirthday().getDay();
        int comparedDay = compared.getBirthday().getDay();

        if (ownDay < comparedDay) {
            System.out.println("day");
            return true;
        }

        return false;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", birthDate=" + birthDate +
                '}';
    }
}
