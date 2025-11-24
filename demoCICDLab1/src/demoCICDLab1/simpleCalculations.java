package demoCICDLab1;

public class simpleCalculations {

    // ---- ADD ----
    public double add(double a, double b) {
        return a + b;
    }
    // default parameters: a = 10, b = 5
    public double add() {
        return add(10, 5);
    }

    // ---- SUBTRACT ----
    public double subtract(double a, double b) {
        return a - b;
    }
    // default parameters
    public double subtract() {
        return subtract(10, 5);
    }

    // ---- MULTIPLY ----
    public double multiply(double a, double b) {
        return a * b;
    }
    // default parameters
    public double multiply() {
        return multiply(10, 5);
    }

    // ---- DIVIDE ----
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return Double.NaN;
        }
        return a / b;
    }
    // default parameters
    public double divide() {
        return divide(10, 5);
    }

    public static void main(String[] args) {
        simpleCalculations calc = new simpleCalculations(); // create object

        // Using default values
        System.out.println("Addition (default): " + calc.add());
        System.out.println("Subtraction (default): " + calc.subtract());
        System.out.println("Multiplication (default): " + calc.multiply());
        System.out.println("Division (default): " + calc.divide());

        // Using custom values
        System.out.println("\nAddition (custom): " + calc.add(20, 7));
        System.out.println("Subtraction (custom): " + calc.subtract(20, 7));
        System.out.println("Multiplication (custom): " + calc.multiply(20, 7));
        System.out.println("Division (custom): " + calc.divide(20, 7));
    }
}
