package Static_Singleton_Packages.staticExample;

public class Main {
    static void main(String[] args) {
        Human nikhil = new Human(21, 100000, "Nikhil Rai", false , false);
        Human shekhar = new Human(22, 90000, "Shekhar Singh", false , false);
        Human raja = new Human(22, 90000, "raja pauwa Singh", false , false);
        System.out.println(nikhil.name);
        System.out.println(shekhar.name);
        System.out.println(raja.name);
        System.out.println(nikhil.population);
        System.out.println(shekhar.population);
        System.out.println(raja.population);
        //Nikhil Rai
        //Shekhar Singh
        //raja pauwa Singh
        //1
        //1
        //1
        //why it is one because for each oject poppulation is different and it it iniatlised again for each object
        //in order to prevent this we use static
        //after static
        //Nikhil Rai
        //Shekhar Singh
        //raja pauwa Singh
        //3
        //3
        //3
        //population common to all 3 and counted all 3
        greeting();
        //this is not dependent on objects
//        static void fun() {
//            greeting(); // you cant use this because it requires an instance
//            // but the function you are using it in does not depend on instances
//        }


    }
    static void greeting(){
        System.out.println("hello"); // if we dont put static and use it static then it means it has instance as it is part of object and gonna be used in some thing that dont have any instance so it gives error so it has to be static
    }
}
