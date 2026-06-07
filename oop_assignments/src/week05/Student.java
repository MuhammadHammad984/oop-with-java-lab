package week05;

public class Student {

    String name;
    int age;

    // default constructor
    public Student() {
        name = "Unknown";
        age = 0;
    }

    // parameterized constructor (name only)
    public Student(String name) {
        this.name = name;
        age = 0;
    }

    // parameterized constructor (name and age)
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Ikram");
        Student s3 = new Student("Naeem", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}