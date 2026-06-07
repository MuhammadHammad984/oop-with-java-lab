package week01;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand = "Toyota";
		car1.model = "Camry";
		car1.year = 2024;

		Car car2 = new Car();
		car2.brand = "Honda";
		car2.model = "Civic";
		car2.year = 2025;

		Car car3 = new Car();
		car3.brand = "Tesla";
		car3.model = "Model 3";
		car3.year = 2026;

		System.out.println("Car 1: " + car1.year + " " + car1.brand + " " + car1.model);
		System.out.println("Car 2: " + car2.year + " " + car2.brand + " " + car2.model);
		System.out.println("Car 3: " + car3.year + " " + car3.brand + " " + car3.model);

	}

}
