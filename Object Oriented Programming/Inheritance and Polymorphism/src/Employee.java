public sealed class Employee permits Manager, Salesman, Attendant {
    protected String name;
    protected String email;
    protected String password;
    protected final Boolean isAdmin;

    protected static double financialBalance = 0.0;
    protected static int numberOfSales = 0;

    public Employee(String name, String email, String password, Boolean isAdmin) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void login(){
        System.out.println("Login successful for " + name);
    }

    public void logout(){
        System.out.println("Logout successful for " + name);
    }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Password reset successful for " + name);
    }

    public void updateEmail(String newEmail) {
        this.email = newEmail;
        System.out.println("Email updated successfully for " + name);
    }

    public void updateName(String newName) {
        this.name = newName;
        System.out.println("Name updated successfully for " + name);
    }
}
