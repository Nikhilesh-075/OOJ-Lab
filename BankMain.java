import java.util.Scanner;

class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    // Constructor
    public Account(String name, int number, String type, double initialBalance) {
        customerName = name;
        accountNumber = number;
        accountType = type;
        balance = initialBalance;
    }

    // Method to accept deposit and update the balance
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Updated balance: " + balance);
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class CurrAcct extends Account {
    double minBalance;
    double serviceCharge;

    // Constructor
    public CurrAcct(String name, int number, double initialBalance) {
        super(name, number, "Current", initialBalance);
        minBalance = 500.0; // Set the minimum balance for current account
        serviceCharge = 50.0; // Set the service charge for falling below minimum balance
    }

    // Method to withdraw and update balance, checking for minimum balance
    public void withdraw(double amount) {
        if ((balance - amount) >= minBalance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Service charge of " + serviceCharge + " imposed.");
            balance -= serviceCharge;
            System.out.println("Updated balance after service charge: " + balance);
        }
    }
}

class SavAcct extends Account {
    double interestRate;

    // Constructor
    public SavAcct(String name, int number, double initialBalance, double rate) {
        super(name, number, "Savings", initialBalance);
        interestRate = rate;
    }

    // Method to compute and deposit interest
    public void depositInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest of " + interest + " deposited. Updated balance: " + balance);
    }

    // Method to withdraw and update balance
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample usage
        CurrAcct currentAccount = new CurrAcct("John Doe", 123456, 1000.0);
        SavAcct savingsAccount = new SavAcct("Jane Smith", 789012, 2000.0, 5.0);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Display Balance");
            System.out.println("3. Deposit Interest (for Savings Account)");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    currentAccount.deposit(depositAmount);
                    break;
                case 2:
                    currentAccount.displayBalance();
                    break;
                case 3:
                    if (savingsAccount instanceof SavAcct) {
                        ((SavAcct) savingsAccount).depositInterest();
                    } else {
                        System.out.println("This option is applicable only for Savings Account.");
                    }
                    break;
                case 4:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    currentAccount.withdraw(withdrawalAmount);
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);
    }
}