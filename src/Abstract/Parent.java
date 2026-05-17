package Abstract;

public abstract class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }

    abstract void career(String Name);
    abstract void partner( String Name , int age);

    //WE CANT CREATE A OBJECT OF THIS CLASS BECAUSE ITS METHOD DONT HAVE A BODY
    //WE CANT CREATE ABSTRACT STATIC METHOD AS ABSTRACT METHOD ARE MADE TO BE OVERRIDDEN BUT STATIC CANT BE OVERIDDEN SUPREMEN DADA

    //same for final cant be inherited if creatae same for all abstract child
    static void greet(){
        System.out.println("Hello ! bachha log kaise jo");
    }
    //BUT CAN CREATE STATIC METHOD (NORMAL ONE ) IN ABSTARCT CLASS BCZ THEY DONT NEED OBJECT
}
