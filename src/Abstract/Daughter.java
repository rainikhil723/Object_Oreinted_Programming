package Abstract;

public class Daughter extends Parent{

    @Override
    void career(String Name) {
        System.out.println(" I would not become a" + " " + Name);
    }

    public Daughter(String name) {
        super(name);
    }

    @Override
    void partner(String Name, int age) {
        System.out.println(" I love " + " " + Name +" "+  "age is " + age);
    }
}
