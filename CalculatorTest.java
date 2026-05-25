
public class CalculatorTest {

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        int addResult = cal.add(10, 5);
        int subResult = cal.subtract(10, 5);
        int mulResult = cal.multiply(10, 5);

        System.out.println("Result of addition: " + addResult);
        System.out.println("Result of subtraction: " + subResult);
        System.out.println("Result of multiplication: " + mulResult);
    }
}