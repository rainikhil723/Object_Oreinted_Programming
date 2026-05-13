package Static_Singleton_Packages.Singleton;

public class Singleton {
    //it is used when we want exactly one object for any particular class
    private Singleton () {


    }
    private static Singleton instance;

    public static Singleton getInstance() {
        // check whether 1 obj only is created or not
        if (instance == null) {
            instance = new Singleton() ;
        }
        return instance;
    }
}
