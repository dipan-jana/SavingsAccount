import java.util.Random;
import java.util.Scanner;

public class Customer {
    private static final Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    private int customerID;
    private String customerName;
    private String mobile;
    private String gender;


    public int getCustomerID() {
        customerID = (int)Math.random();
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        System.out.print("\nEnter the name: ");
        customerName = scanner.nextLine().toUpperCase();
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobile() {
        System.out.print("Enter the Mobile Number: ");
        mobile = scanner.nextLine();
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        System.out.print("Enter the Gender: ");
        gender = scanner.nextLine().toUpperCase();
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void printCustomer() {
        System.out.println("*** Customer Details ***");
        System.out.print("\n\tID: " + this.customerID);
        System.out.print("\n\tName: " + this.customerName);
        System.out.print("\n\tMobile: " + this.mobile);
        System.out.print("\n\tGender: " + this.gender);
    }
}
