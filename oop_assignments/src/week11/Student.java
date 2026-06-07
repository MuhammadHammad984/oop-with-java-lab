package week11;

class Student {

    private String name;
    private int marks;

    public void setValues(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void displayValues() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}