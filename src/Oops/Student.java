package Oops;

public class Student {
    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    //Default constructor // attribute --> Garbage
    public Student() {
        System.out.println("Student Default Constructor..");
    }

    // Methods / Behaviors
    public void study() {
        System.out.println(name + " is Studying");
    }
    public void bunk() {
        System.out.println(name + " has bunked");
    }
    public void sleep() {
        System.out.println(name + " is Sleeping");
    }


}
