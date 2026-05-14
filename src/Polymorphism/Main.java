package Polymorphism;

public class Main {
    static void main(String[] args) {
        Shapes circle = new Circle();//here which area (child or parent)  ==> child one
        Circle c =  new Circle();
        Shapes sq =  new Square();
        Square sqr = new Square();
        Rectangle rect = new Rectangle();
        circle.area();
        c.area();
        sq.area();
        sqr.area();
        rect.area();
        //here child class is overridding the parent
        // or parent class is overridden by child

        // here if we put the same name function then also it will differ based on inside content this is called method overloading

    }
}
