package Static_Singleton_Packages;
//initially you have to specify

import static Static_Singleton_Packages.Greeting.greeting;
//in this package  there is ___ class ___ containing this ___ method
// i can use other classes methods also in same packages just by importing


public class test {
    static void main(String[] args) {
        //it is simply a folder that we have given a different and cool name called package
        // it is used in order to create create same name file
        System.out.println("basically what is package that i have created?");
        greeting();
    }
}
