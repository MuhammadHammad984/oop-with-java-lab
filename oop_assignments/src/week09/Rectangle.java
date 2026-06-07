package week09;

class Rectangle extends Shape {
    int length = 4;
    int width = 6;

    void area() {
        System.out.println("Area of Rectangle = " + (length * width));
    }
}