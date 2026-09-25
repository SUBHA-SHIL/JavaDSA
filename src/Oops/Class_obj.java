package Oops;

public class Class_obj {
    public static class Student {
        String name;
        int roll;

        public void initialize(String n, int a) {
            name = n;
            roll = a;
        }
    }
    public static class Main {
        int x = 5;

        public static void main(String[] args) {
            Student s1 = new Student();
            s1.initialize("Subha", 13);

            System.out.println(s1.name + s1.roll);


        }
    }
}
