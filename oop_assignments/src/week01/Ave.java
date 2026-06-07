package week01;
import java.util.Scanner; 

public class Ave {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("First number: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Second number: ");
		double num2 = sc.nextDouble();
		
		double ave = (num1 + num2) / 2;
		
		System.out.println("Average: " + ave);
	}

}
