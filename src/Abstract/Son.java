package Abstract;

public class Son extends Parent{
    @Override
    void career(String Name) {
        System.out.println("I am gonna be a " + " " + Name);
    }

    public Son(String name) {
        super(name);
    }

    @Override
    void partner(String Name, int age) {
        System.out.println("My parter would be" +  " "  + Name + " " +"and age is " + age);
    }

}
