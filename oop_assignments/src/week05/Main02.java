package week05;

public class Main02 {
    public static void main(String[] args) {

        Employee e;

        e = new Manager();
        e.calculateSalary();

        e = new Developer();
        e.calculateSalary();
    }
}
