package Inheritence;

public class BoxPrice extends BoxWeight {

    // this is child of boxWeight which is itself a child of Box
    // this would be example of multilevel inheritence
    private int secret;

    double cost;

    public void setSecret(int secret) {
        this.secret = secret;
    }

    public int getSecret() {
        return secret;
    }


    BoxPrice () {
        super() ;
        this.cost = -1;
    }
    BoxPrice(BoxPrice other) {
        super ();
        this.cost = other.cost;
    }
    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super (l, h, w, weight);
        this.cost = cost;
    }
}
