package week14;

import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter index: ");
        int index = input.nextInt();

        try {
            System.out.println("Element = " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index.");
        }
        input.close();
    }
}