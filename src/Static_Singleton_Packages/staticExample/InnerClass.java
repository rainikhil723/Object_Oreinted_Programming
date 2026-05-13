package Static_Singleton_Packages.staticExample;

public class InnerClass {
    //outside class cant be static
    static class Test{
        String name;
        public Test (String name) {
            this.name = name;
        }
        //this class is not dependent on outger class
        // we can  create object of these class withiut creating object of outer class
    }
    public static void main (String[] args) {
        Test a = new Test ( "Kunal");
        Test b = new Test (  "Rahul") ;
        System.out.println(a. name);
        System.out.println(b.name);
        }
    }

