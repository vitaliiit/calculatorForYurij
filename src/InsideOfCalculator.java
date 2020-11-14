import com.orangebook.calculate.Calculator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InsideOfCalculator {

    Scanner scanner = new Scanner(System.in);

    private static int firstOperand;
    private static int secondOperand;
    private static String operator;
    private static double result;

    public int getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(int firstOperand) {
        this.firstOperand = firstOperand;
    }

    public int getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(int secondOperand) {
        this.secondOperand = secondOperand;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    void start() {
        System.out.println("\nYura hello my friend! I glad to see you in my amazing calculator world!\n");
        enterNumber();
    }

    void enterNumber() {
        System.out.println("Yura enter the first operand!");

        try {
            firstOperand = scanner.nextInt();
            System.out.println("You enter - " + firstOperand);
            System.out.println("Yura enter the second operand!");
            secondOperand = scanner.nextInt();
            System.out.println("You enter - " + secondOperand + "\n");
            System.out.println("Thanks Yura!\n");
            chooseOperator();
        } catch (InputMismatchException e) {
            System.out.println("Yura you enter too large number. Be careful!\n");
        }
    }

    void chooseOperator() {
        System.out.println("Yura what do you want todo of this operands?\n");
        System.out.println("if you want 'added' this operands - enter 'add' or character '+'\n" +
                "if you want 'subtracted' this operands - enter 'subtract' or character '-'\n" +
                "if you want 'multiply' this operands - enter 'multiply' or character '*' \n" +
                "if you want 'divided' this operands - enter 'divide' or character '/'");
        scanner.nextLine();
        operator = scanner.nextLine();
        System.out.println("You enter " + operator + "\n");

        Calculator calculator = null;
        calculator = chooseAction(calculator);
        setResult(calculator.calculate(getFirstOperand(), getSecondOperand()));
        result();

    }

    private Calculator chooseAction(Calculator calculator) {
        System.out.println(operator.hashCode());
        System.out.println("+".hashCode());
        switch (operator) {
            case "+":
                calculator = (a, b) -> a + b;
                break;
            case "-":
                calculator = (a, b) -> a - b;
                break;
            case "*":
                calculator = (a, b) -> a * b;
                break;
            case "/":
                calculator = (a, b) -> a / b;
                break;
            default:
                calculator = null;
        }
        return calculator;
    }

    void result() {
        if (result == 545451687) {
            System.out.println("Try again!\n");
            enterNumber();
        } else {
            System.out.println("result is - " + result + "\n");
            System.out.println("Nice work Yura!");
        }
    }
}










