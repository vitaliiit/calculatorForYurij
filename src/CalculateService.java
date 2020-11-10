public class CalculateService {

    double generalResult;

    InsideOfCalculator insideOfCalculator = new InsideOfCalculator();

    void math() {
        switch (insideOfCalculator.getOperator()) {
            case "add", "+":
                add(insideOfCalculator.getFirstOperand(), insideOfCalculator.getSecondOperand());
                break;
            case "subtract", "-":
                subtract(insideOfCalculator.getFirstOperand(), insideOfCalculator.getSecondOperand());
                break;
            case "multiply", "*":
                multiply(insideOfCalculator.getFirstOperand(), insideOfCalculator.getSecondOperand());
                break;
            case "divide", "/":
                divide(insideOfCalculator.getFirstOperand(), insideOfCalculator.getSecondOperand());
                break;
        }
        insideOfCalculator.setResult(generalResult);
        insideOfCalculator.result();
    }

    private double add(double a, double b) {
        return generalResult = a + b;
    }

    private double subtract(double a, double b) {
        return generalResult = a - b;
    }

    private double multiply(double a, double b) {
        return generalResult = a * b;
    }

    private double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Danger! Yura - you try divide to 0. Don't do this please!\n");
            return generalResult = 545451687.0;
        } else {
            return generalResult = a / b;
        }
    }
}

