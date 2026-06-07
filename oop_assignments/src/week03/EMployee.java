package week03;

public class EMployee {

    static String companyName = "Khattak ltd.";

    String employeeName;
    String employeeID;

    public EMployee(String employeeName, String employeeID) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }

    public void display() {
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + employeeName);
        System.out.println("ID: " + employeeID);
        System.out.println();
    }

    public static void main(String[] args) {

        EMployee e1 = new EMployee("Haris Shahzad", "5112325006");
        EMployee e2 = new EMployee("Amanullah Khan", "5112325034");

        e1.display();
        e2.display();
    }
}