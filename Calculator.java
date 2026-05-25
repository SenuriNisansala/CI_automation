public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        System.out.println("Addition = " + cal.add(10, 5));
        System.out.println("Subtraction = " + cal.subtract(10, 5));
        System.out.println("Multiplication = " + cal.multiply(10, 5));
    }
}