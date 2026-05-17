package Abstract;

public class Main {
    static void main(String[] args) {
        //you can not create pbject of an abstract class
        Son nikhil = new Son("VIJAY");
        nikhil.career("SDE");
        nikhil.partner("Sidak" , 22);
        Daughter bhavika = new Daughter("VIJAY");
        bhavika.career("Doctor");
        bhavika.partner("India", 80);
        Parent.greet();

    }
}
