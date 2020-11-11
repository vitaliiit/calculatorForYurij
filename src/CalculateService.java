public class CalculateService {

    private double operatingVariable;

    void math(String operation, int firstOperand, int secondOperand) {
        switch (operation) {
            case "add", "+":
                add(firstOperand, secondOperand);
                break;
            case "subtract", "-":
                subtract(firstOperand, secondOperand);
                break;
            case "multiply", "*":
                multiply(firstOperand, secondOperand);
                break;
            case "divide", "/":
                divide(firstOperand, secondOperand);
                break;
        }
        InsideOfCalculator insideOfCalculator = new InsideOfCalculator();
        insideOfCalculator.setResult(operatingVariable);
        insideOfCalculator.printResult();
    }

    private double add(double a, double b) {
        return operatingVariable = a + b;
    }

    private double subtract(double a, double b) {
        return operatingVariable = a - b;
    }

    private double multiply(double a, double b) {
        return operatingVariable = a * b;
    }

    private double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Danger! Yura - you try divide to 0. Don't do this please!\n");
            return operatingVariable = 545451687.0;
        } else {
            return operatingVariable = a / b;
        }
    }
}

