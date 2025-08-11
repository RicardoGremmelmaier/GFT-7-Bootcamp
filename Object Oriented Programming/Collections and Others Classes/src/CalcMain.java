public class CalcMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        calculator.add("10, 20, 30");
        System.out.println("After addition: " + calculator.getInt());
        
        calculator.subtract("5, 15");
        System.out.println("After subtraction: " + calculator.getInt());
    }
}
