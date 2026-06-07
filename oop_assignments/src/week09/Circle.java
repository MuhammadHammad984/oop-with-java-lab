package week09;

class Circle extends Shape {
    double radius = 5;

    void area() {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}