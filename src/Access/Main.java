package Access;

public class Main {
    public static void main(String[] args) {
        Access ac = new Access("Nikhil");
        System.out.println(ac.name);
//        System.out.println(ac.user); cant access as it is private
        ac.setPassword(15022005);
        ac.setUsername(723);
        int a = ac.getPassword();
        int b =ac.getUsername();
        System.out.println(a +  " " + b);


    }
}
