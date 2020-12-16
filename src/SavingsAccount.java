public class SavingsAccount {
    double balance;
    double previousTransaction;

    void deposit(double amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
            System.out.println(amount + " Deposited in Your Account");
        }
    }

    void withdraw(double amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
            System.out.println(amount + " has been Withdrawn");
        }
    }
    void getPreviousTransaction() {

        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        }
        else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        }
        else {
            System.out.println("No Transaction Found");
        }
    }
}
