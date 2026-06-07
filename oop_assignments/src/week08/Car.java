package week08;

public class Car {

    String model;
    String color;
    int engNo;

    // Default constructor
    public Car() {
        model = "Unknown";
        color = "Black";
        engNo = 0;
    }

    // Constructor with Model and Color
    public Car(String model, String color) {
        this();
        this.model = model;
        this.color = color;
    }

    // Constructor with Model, Color and Eng No
    public Car(String model, String color, int engNo) {
        this(model, color);
        this.engNo = engNo;
    }
}
