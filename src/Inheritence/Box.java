package Inheritence;
//Parent class
public class Box {
    int l;
    int b;
    int h;

    Box(){
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    Box(int side){
        this.l = side;
        this.b = side;
        this.h = side;
    }

    Box(int l , int b , int h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(Box old){ //assigning older value
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }

    // these are all example of Method overloading as we are creating constructor that have same name but getting distinguished on basis of parameter type and numbers
    public void information(){
        System.out.println("Running the Box successfully");
    }
}
