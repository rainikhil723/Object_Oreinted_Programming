package Inheritence;

public class BoxWeight extends Box {
    double weight;
    BoxWeight(double weight){
        this.weight = weight;
    }

    public BoxWeight(int side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(int l, int b, int h, double weight) {
        super(l, b, h); //what is super ? it basically means call the parent class constructor
        //used to initialise value present in parent class
        this.weight = weight;
    }

    public BoxWeight(Box old, double weight) {
        super(old);
        this.weight = weight;
    }
}
