import java.util.Scanner;

public class Classes_Objects {
    static class Student{
        int rollno;
        int marks;
        String Name;

        Student(int rollno , int marks , String Name){
            this.rollno = rollno;
            this.marks = marks;
            this.Name = Name;
        }
        void greet(){
            System.out.println("Hello! I am "+ this.Name);
        }
    }
    public static void main() {
//        Student nikhil = new Student(); // intial with default value null or 0
//        Student shekhar  = new Student();
//        Student teja = new Student();
//        Student rohit = new Student();
//        nikhil.marks = 97;
//        nikhil.rollno = 22;
//        nikhil.Name = "Nikhil Rai";
//        shekhar.marks = 43;
//        shekhar.rollno = 21;
//        shekhar.Name = "Chandra Shekhar Singh";
//        rohit.marks = 54;
//        rohit.rollno = 23;
//        rohit.Name = "Rohit Sharma";
//        teja.marks = 65;
//        teja.rollno = 25;
//        teja.Name = " Tejasvi Gautam";

//
//        System.out.println(nikhil); // print refrencing object address
//        System.out.println(nikhil.Name);
//        System.out.println(nikhil.marks);
//        System.out.println(nikhil.rollno);

        // another way of creating an object using construtor during run time
        Student santosh =  new Student(12,70,"Santosh Rawat");
//
//        System.out.println(santosh);
//        System.out.println(santosh.Name);
//        System.out.println(santosh.marks);
//        System.out.println(santosh.rollno);
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the number of Student :");
//        int n = s.nextInt();
//
//        for(int i =0 ; i< n ;i++){
//            System.out.println("Enter the marks of Student :");
//            int marks = s.nextInt();
//            System.out.println("Enter the rollno of Student :");
//            int rollno = s.nextInt();
//            System.out.println("Enter the name of Student :");
//            String Name = s.next();
//
//            Student stds = new Student(rollno, marks, Name );
//            System.out.println("Hello ! " + " My name is " + stds.Name );
//            System.out.println(  "My Roll number is "+ stds.rollno);
//            System.out.println("My Marks are :" + stds.marks);
//
//
//        }
        santosh.greet();
//        this ek reference ke liye h jo object ke value ko reference karega

        //other minor concept like final which is like const
        // then garbage collection that automaticalay destroys in memoey





    }
}
