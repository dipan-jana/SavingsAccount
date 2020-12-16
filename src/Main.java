import java.util.Scanner;

public class Main {
    SavingsAccount obj = new SavingsAccount();
    Customer customer = new Customer();


    public static void main(String[] args) {
        Main main = new Main();
        main.showMenu();
    }

    void showMenu() {
        char option = '\0';
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("********************** Welcome to XYZ BANK **********************");

        System.out.println("\n\t 1 : New User");
        System.out.println("\n\t 2 : Existing User");
        System.out.println("\n\t 3 : Exit");
        do {
            System.out.println("\n");
            System.out.println("\n**********************");
            System.out.print("Enter a Choice: ");
            choice = scanner.nextInt();
            System.out.println("\n");

            switch (choice) {
                case 1:
                    System.out.println("********************** WELCOME NEW USER **********************");

                    customer.getCustomerName();
                    customer.getMobile();
                    customer.getGender();
                    System.out.println();
                    customer.printCustomer();
                    break;


                case 2:
                    System.out.println("\t********************** WELCOME TO YOUR ACCOUNT **********************");
                    System.out.print("\nEnter Your Customer ID: ");
                    int id = scanner.nextInt();
                    if (id == customer.getCustomerID()) {
                        System.out.println("A : Check Balance");
                        System.out.println("B : Deposit ");
                        System.out.println("C : Withdraw");
                        System.out.println("D : Previous Transaction");
                        System.out.println("E : Exit from this Page");
                        do {
                            System.out.println("\n");
                            System.out.print("Enter an Option: ");
                            option = Character.toUpperCase(scanner.next().charAt(0));
                            System.out.println("\n");

                            switch (option) {
                                case 'A':
                                    System.out.println("Balance : " + obj.balance);
                                    System.out.println("\n");
                                    break;

                                case 'B':
                                    System.out.println("\n");
                                    System.out.print("Enter an amount to deposit: ");
                                    double amount = scanner.nextDouble();
                                    obj.deposit(amount);
                                    System.out.println("\n");
                                    break;

                                case 'C':
                                    System.out.println();
                                    System.out.print("Enter and amount to withdraw: ");
                                    double withdrawAmount = scanner.nextDouble();
                                    obj.withdraw(withdrawAmount);
                                    System.out.println("\n");
                                    break;

                                case 'D':
                                    obj.getPreviousTransaction();
                                    System.out.println("\n");
                                    break;
                                case 'E':
                                    System.out.println("----------------------------------------------");
                                    break;

                                default:
                                    System.out.println("enter correct choice");
                                    break;

                            }

                        } while (option != 'E');
                        System.out.println("********************** Thank You **********************");

                    }
                    else
                        System.out.println("WRONG ID");
                        break;
                case 3 :
                    System.out.println("----------------------------------------------");
                    break;
            }
        } while (choice != 3);
        System.out.println("********************** Thank You for using our Service **********************");

    }
}