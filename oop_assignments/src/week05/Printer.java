package week05;

public class Printer {

    void print(int n) {
        System.out.println(n);
    }

    void print(double d) {
        System.out.println(d);
    }

    void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        Printer p = new Printer();

        p.print(10);
        p.print(5.5);
        p.print("Hello");
    }
}