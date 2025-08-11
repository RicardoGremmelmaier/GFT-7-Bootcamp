public class Calculator {

    private int result = 0;
    
    public int getInt() {
        return result;
    }

    public void add(String values) {
        String[] nums = values.split(",");
        for (String num : nums) {
            result += Integer.parseInt(num.trim());
        }
    }

    public void subtract(String values) {
        String[] nums = values.split(",");
        for (String num : nums) {
            result -= Integer.parseInt(num.trim());
        }
    }
}
