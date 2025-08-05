public non-sealed class Attendant extends Employee{
    private double cash;

    public Attendant(String name, String email, String password) {
        super(name, email, password, false);
        this.cash = 0.0;
    }

    public void processPayment(double amount) {
        cash += amount;
        System.out.println("Payment processed by " + name + ": " + amount);
    }

    public void closeCashRegister() {
        financialBalance += cash;
        System.out.println("Cash register closed by " + name);
        System.out.println("Total cash: " + cash);
        cash = 0.0;
    }

}
