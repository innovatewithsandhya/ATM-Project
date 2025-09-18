package basicProjects;
import java.util.ArrayList;
import java.util.Scanner;

public class AtmProject {
    class Account{
        String accountNumber;
        String accountHolderName;
        int pin;
        double balance;
        ArrayList<String> transactionHistory;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = 3456787.23;
        boolean exit = false;

        System.out.println("----Welcome to the Tech ATM----");

        while (!exit) {
            System.out.println("\nEnter the following options to proceed:");
            System.out.println("1: Withdraw Amount");
            System.out.println("2: Deposit Amount");
            System.out.println("3: Check Your Balance");
            System.out.println("4: Exit");
            System.out.print("OPTION: ");

            if(!sc.hasNextInt()) {
                System.out.println("Invalid Input! Enter the option numbers.");
                sc.next();
                continue;
            }
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter the amount to withdraw: ");
                    if(sc.hasNextDouble()) {
                        double withDraw = sc.nextDouble();
                        if(withDraw <= 0) {
                            System.out.println("Enter a valid amount to withdraw.");
                        } else if(withDraw > amount) {
                            System.out.println("Insufficient Balance!");
                        } else {
                            amount -= withDraw;
                            System.out.printf("Withdrawal Successful. Current Balance: %.2f%n", amount);
                        }
                    } else {
                        System.out.println("Invalid Amount!");
                        sc.next(); // clear wrong input
                    }
                    break;

                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    if(sc.hasNextDouble()) {
                        double deposit = sc.nextDouble();
                        if(deposit <= 0) {
                            System.out.println("Enter a valid amount to deposit.");
                        } else {
                            amount += deposit;
                            System.out.printf("Deposit Successful. Current Balance: %.2f%n", amount);
                        }
                    } else {
                        System.out.println("Invalid Amount!");
                        sc.next(); // clear wrong input
                    }
                    break;

                case 3:
                    System.out.printf("Your current balance is: %.2f%n", amount);
                    break;

                case 4:
                    System.out.println("Thank you for using Tech ATM. Have a great day!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid Option! Try again.");
            }
        }
        sc.close();
    }
}
