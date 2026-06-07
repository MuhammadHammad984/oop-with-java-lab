package week14;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TryCatchFinally {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid numeric input.");
        } finally {
            System.out.println("Finally block executed.");
            input.close();
        }
    }
}