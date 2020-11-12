package com.calculatorForYurij;
import java.util.HashMap;
import java.util.Map;

public class MathService {

    private double operatingVariable;

    void MathStuff(String operator, double firstOperand, double secondOperand) {
        Math math;
        Map<String, Math> myMapMaster = new HashMap<>();

        myMapMaster.put("+", new Added());
        myMapMaster.put("-", new Subtract());
        myMapMaster.put("*", new Multiply());
        myMapMaster.put("/", new Divided());

        math = myMapMaster.get(operator);
        operatingVariable = math.mathOperation(firstOperand, secondOperand);
        InsideOfCalculator insideOfCalculator = new InsideOfCalculator();
        insideOfCalculator.setResult(operatingVariable);
        insideOfCalculator.printResult();
    }
}
