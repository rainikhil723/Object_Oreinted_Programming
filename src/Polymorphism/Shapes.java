package Polymorphism;

public class Shapes {
//we notice that at any chance it not runnign in default it is overridden
    // can we remove it ?
    // no we cant it defines the class shaper refrence that which one to access
    // if we delete then no reference variable to access area method
    // and which one to overidde id decided by Java Dyanamic Method dispatch
    void area() {

        System.out.println(" My Area is depeendent on shapes");
    }

   //used to prevent overidding and inheritence too
    //just put final aheaad of that class name or method
    //Early binding: check notes
    //final void area() {
    //    System.out.println("I am in shapes");
    //}
}

