package com.calculatorForYurij;
import com.calculatorForYurij.exception.CalculatorException;
import java.util.HashMap;
import java.util.Map;

public class MathService {

    double mathStuff(String operator, double firstOperand, double secondOperand) throws CalculatorException {
        Math math;
        Map<String, Math> myMapMaster = new HashMap<>();

        myMapMaster.put("+", new Added());
        myMapMaster.put("-", new Subtract());
        myMapMaster.put("*", new Multiply());
        myMapMaster.put("/", new Divided());

        math = myMapMaster.get(operator);
        try {
            return  math.mathOperation(firstOperand, secondOperand);
        } catch (RuntimeException e) {
            throw new CalculatorException(e);
        }

    }
}
