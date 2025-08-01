public class BankSlip {
    private double amountToPay;
    private boolean isPaid;

    public BankSlip(double amountToPay) {
        this.amountToPay = amountToPay;
        this.isPaid = false;
    }

    public double getAmountToPay() {
        return amountToPay;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void pay(double amount) {
        if (!isPaid) {
            if (amount < amountToPay) {
                System.out.println("Insufficient amount paid. Please pay the full amount of " + amountToPay);
                return;
            }
            isPaid = true;
            System.out.println("Bank slip paid.");
        } else {
            System.out.println("Bank slip is already paid.");
        }
    }

}
