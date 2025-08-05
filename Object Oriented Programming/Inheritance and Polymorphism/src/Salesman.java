public non-sealed class Salesman extends Employee{
    private int numberOfSalesMade;

    public Salesman(String name, String email, String password) {
        super(name, email, password, false);
        this.numberOfSalesMade = 0;
    }

    public void makeSale(double saleAmount) {
        financialBalance += saleAmount;
        numberOfSales++;
        numberOfSalesMade++;
        System.out.println("Sale made by " + name + ": " + saleAmount);
    }

    public void generateSalesReport() {
        System.out.println("Sales Report for " + name);
        System.out.println("Total Sales Made: " + numberOfSalesMade);
    }

}
