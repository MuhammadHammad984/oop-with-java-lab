package week11;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[10];
        int max, min, sum = 0;
        double avg;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        max = arr[0];
        min = arr[0];

        for (int i = 0; i < 10; i++) {

            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min)
                min = arr[i];

            sum += arr[i];
        }

        avg = (double) sum / 10;

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Average = " + avg);
    }
}