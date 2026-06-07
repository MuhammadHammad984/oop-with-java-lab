package week01;
import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Celsius: ");
		double celsius = sc.nextDouble();
		
		double fahrenheit = (celsius * 9 / 5) + 32;
		
		System.out.println("Fahrenheit: " + fahrenheit);
		
		sc.close();
	}

}
