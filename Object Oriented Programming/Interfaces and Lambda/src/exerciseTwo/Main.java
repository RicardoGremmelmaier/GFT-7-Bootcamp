package exerciseTwo;

public class Main {

    public static void main(String[] args) {
        
        Taxes healthWelfareTax = amount -> amount * 0.015;
        Taxes foodTax = amount -> amount * 0.01;
        Taxes clothingTax = amount -> amount * 0.025;
        Taxes cultureTax = amount -> amount * 0.04;

        System.out.println("Health Welfare Tax on $1000: $" + healthWelfareTax.calculateTax(1000));
        System.out.println("Food Tax on $1000: $" + foodTax.calculateTax(1000));
        System.out.println("Clothing Tax on $1000: $" + clothingTax.calculateTax(1000));
        System.out.println("Culture Tax on $1000: $" + cultureTax.calculateTax(1000));
    }

}
