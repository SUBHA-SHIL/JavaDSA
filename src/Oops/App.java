package Oops;

public class App {
    public static void main(String[] args) throws Exception {

//        System.out.println("Helo World");

        //Default ctor
        Student A = new Student();
        A.id = 01;
        A.age = 34;
        A.name = "Subha";
        A.nos = 5;
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.nos);
        System.out.println(A.id);

        A.bunk();
        A.sleep();
        A.study();

    }
}
