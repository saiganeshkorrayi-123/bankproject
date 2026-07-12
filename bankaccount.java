import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        bankaccount acc = new bankaccount("John", 290281912, 1000);

        System.out.println("Account Holder Name : " + acc.getaccname());
        System.out.println("Account Number      : " + acc.getaccnumber());

        while (true) {

            System.out.println("\n----- MENU -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Total Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter amount to deposit: ");
                int amount = sc.nextInt();

                acc.deposit(amount);

                System.out.println("Deposit Successful.");

            } else if (choice == 2) {

                System.out.print("Enter amount to withdraw: ");
                int amount = sc.nextInt();

                acc.withdraw(amount);

            } else if (choice == 3) {

                System.out.println("Total Balance: " + acc.getbalance());

            } else if (choice == 4) {

                System.out.println("Thank You!");
                break;

            } else {

                System.out.println("Invalid Choice!");

            }
        }

        sc.close();
    }
}

class bankaccount{

    private String accname;
    private long accnumber;
    private int balance;

    bankaccount(String accname, long accnumber, int balance) {
        this.accname = accname;
        this.accnumber = accnumber;
        this.balance = balance;
    }

    public void deposit(int amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(int amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public String getaccname() {
        return accname;
    }

    public long getaccnumber() {
        return accnumber;
    }

    public int getbalance() {
        return balance;
    }
}