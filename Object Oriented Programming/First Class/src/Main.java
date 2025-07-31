import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        var option = -1;

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(initialBalance);
        System.out.println("Bank account created with balance: " + account.getBalance() + " and special check: " + account.getSpecialCheck());
        
        do {
            System.out.println("====================================");
            System.out.println("1. Deposit money");
            System.out.println("2. Make a payment");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check balance");
            System.out.println("5. Check if using special check");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter payment amount: ");
                    double paymentAmount = scanner.nextDouble();
                    account.payment(paymentAmount);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;

                case 4:
                    System.out.println("Current balance: " + account.getBalance());
                    System.out.println("Special check available: " + account.getSpecialCheck());
                    break;

                case 5:
                    if (account.isUsingSpecialCheck()) {
                        System.out.println("You are currently using the special check.");
                    } else {
                        System.out.println("You are not using the special check.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }

            if (account.isUsingSpecialCheck()){
                System.out.println("You are currently using the special check. We are trying to pay your special check.");
                account.paySpecialCheck();
            }

            System.out.println("====================================");

        } while (option != 0);
        scanner.close();
        System.out.println("Thank you for using the bank system!");
    }
}
