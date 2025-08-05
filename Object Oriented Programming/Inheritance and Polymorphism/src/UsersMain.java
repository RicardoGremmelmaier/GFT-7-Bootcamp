public class UsersMain {
    public static void main(String[] args) throws Exception {
        Manager manager = new Manager("Alice", "alice@example.com", "password123");
        Salesman salesman = new Salesman("Bob", "bob@example.com", "password123");
        Attendant attendant = new Attendant("Charlie", "charlie@example.com", "password123");

        salesman.login();
        salesman.makeSale(150.0);
        salesman.makeSale(250.0);
        salesman.makeSale(50.0);
        salesman.generateSalesReport();
        salesman.updateEmail("robert@example.com");
        salesman.updateName("Robert");
        salesman.resetPassword("newpassword123");
        salesman.logout();

        attendant.login();
        attendant.processPayment(100.0);
        attendant.processPayment(200.0);
        attendant.updateEmail("charlie.new@example.com");
        attendant.updateName("Charlie Brown");
        attendant.resetPassword("newpassword456");
        attendant.closeCashRegister();
        attendant.logout();

        manager.login();
        manager.generateFinancialReport();
        manager.generateSalesReport();
        manager.updateEmail("alice.new@example.com");
        manager.updateName("Alice Smith");
        manager.resetPassword("newpassword789");
        manager.logout();
    }
}
