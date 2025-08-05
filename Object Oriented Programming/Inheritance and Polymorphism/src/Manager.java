public non-sealed class Manager extends Employee{
    public Manager(String name, String email, String password) {
        super(name, email, password, true);
    }

    public void generateFinancialReport() {
        System.out.println("Financial Report Generated");
        System.out.println("Total Sales: " + numberOfSales);
        System.out.println("Financial Balance: " + financialBalance);
    }

    public void generateSalesReport() {
        System.out.println("Sales Report Generated");
        System.out.println("Total Sales: " + numberOfSales);
    }

}
