package Inheritence;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        Box box2 = new Box(20);
//        Box box3 = new Box(10, 20, 30);
//        Box box4 = new Box(box2);
//
//        System.out.println(box1.l + " "+ box1.b + " " + box1.h);
//        System.out.println(box2.l + " "+ box2.b + " " + box2.h);
//        System.out.println(box3.l + " "+ box3.b + " " + box3.h);
//        System.out.println(box4.l + " "+ box4.b + " " + box4.h);
        BoxWeight box = new BoxWeight(23,345,54,32);
        System.out.println(box.b+" "+ box.h + " " + box.l+ " "+ box.weight);

    }
}
