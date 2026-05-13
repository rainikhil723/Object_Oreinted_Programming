package Static_Singleton_Packages.staticExample;

public class Human {
    int age;
    int salary;
    String name;
    boolean gender;
    boolean married;
    static int population;

    public Human(int age, int salary, String name, boolean gender, boolean married){
        this.age = age ;
        this.salary = salary;
        this.name = name;
        this.gender = gender;
        this.married = married;
        Human.population+=1; //basically we use this convention (can also use this but classname is preffered)
    }
}
