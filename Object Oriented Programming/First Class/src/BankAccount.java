public class BankAccount {
    private double balance;
    private double specialCheckToPay;
    private double specialCheck;
    private final double initialSpecialCheck;
    private Boolean usingSpecialCheck;

    public BankAccount(double initialBalance){
        if (initialBalance < 0){
            System.out.println("Initial balance cannot be negative. Setting balance to 0 and special check to 50.");
            this.balance = 0;
            this.initialSpecialCheck = 50.0;
            this.specialCheckToPay = 0.0;
            this.updateSpecialCheck();
            return;
        }
        this.balance = initialBalance;
        this.usingSpecialCheck = false;
        if (initialBalance <= 500){
            this.initialSpecialCheck = 50.0;
        } else {
            this.initialSpecialCheck = 0.5 * initialBalance;
        }
        this.specialCheckToPay = 0.0;
        this.specialCheck = initialSpecialCheck;
    }

    public double getBalance() {
        return balance;
    }

    public double getSpecialCheck() {
        return specialCheck;
    }

    public Boolean isUsingSpecialCheck() {
        return usingSpecialCheck;
    }

    private void updateSpecialCheck() {
        specialCheck = initialSpecialCheck - specialCheckToPay;
        if (specialCheck == initialSpecialCheck){
            usingSpecialCheck = false;
        } else {
            usingSpecialCheck = true;
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
    }

    public void payment(BankSlip bankSlip) {
        if (bankSlip.getAmountToPay() > balance + specialCheck) {
            System.out.println("Insufficient funds.");
            return;
        }
        if (bankSlip.getAmountToPay() > balance) {
            specialCheckToPay += (bankSlip.getAmountToPay() - balance);
            this.updateSpecialCheck();
            bankSlip.pay(specialCheckToPay + balance);
            balance = 0;
            System.out.println("Payment made using special check. Remaining balance: " + balance + ", Special check to pay: " + specialCheckToPay);
            return;
        }
        balance -= bankSlip.getAmountToPay();
        System.out.println("Payment made. Remaining balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
    }

    public void paySpecialCheck() {
        if (usingSpecialCheck) {
            if (specialCheckToPay > 0 && balance >= specialCheckToPay * 0.2) {
                balance -= specialCheckToPay * 0.2;
                specialCheckToPay = 0;
                this.updateSpecialCheck();
                System.out.println("Special check paid successfully.");
            } else {
                System.out.println("Not enough balance to pay special check.");
                return;
            }
        } else {
            System.out.println("Not using special check.");
            return;
        }
    }

}
