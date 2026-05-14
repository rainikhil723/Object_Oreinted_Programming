package Polymorphism;

public class Numbers {
    double sum (double a, int b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Numbers obj = new Numbers () ;
        double a = obj.sum(  2, 3);
        int b = obj.sum( 1,  3,  7);
        int  c = obj.sum(4, 5,8);
        System.out.println(a + " "+ b + " "+ c +" ");
    }
}