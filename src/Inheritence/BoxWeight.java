package Inheritence;

public class BoxWeight extends Box {
    double weight;
    BoxWeight(){
        this.weight = weight;
    }

    public BoxWeight(int side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double b, double h, double weight) {
        // super doesnt care about child class but child cllass care about parent that what it contain
        // so super must be initialised first before any initialsation in child

        super(l, b, h); //what is super ? it basically means call the parent class constructor
        //used to initialise value present in parent class

        this.weight = weight;
    }

    //if no super contructor called for initialsation then default first one will be called
    public BoxWeight(Box old, double weight) {
        super(old);
        this.weight = weight;
    }
}
