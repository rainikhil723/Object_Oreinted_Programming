package Interfaces;

public interface A {

        // static interface methods should always have a body
        static void greeting() {
            System. out. println("Hey | AM nikhil don in a static method");
        }
        default void fun() {
            System.out.println("I am in A");
        }


}
