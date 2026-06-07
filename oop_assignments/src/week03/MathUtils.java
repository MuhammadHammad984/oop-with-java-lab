package week03;

public class MathUtils {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int result = MathUtils.add(5, 10);
        System.out.println("Sum: " + result);
    }
}
