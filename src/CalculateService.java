public class CalculateService {

    int generalResult;

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

    private int add(int a, int b) {
        return generalResult = a + b;
    }

    private int subtract(int a, int b) {
        return generalResult = a - b;
    }

    private int multiply(int a, int b) {
        return generalResult = a * b;
    }

    private int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Danger! Yura - you try divide to 0. Don't do this please!\n");
            return generalResult = 545451687;
        } else {
            return generalResult = a / b;
        }
    }

}

