package com.calculatorForYurij.exception;

public class CalculatorException extends RuntimeException {
  public CalculatorException(RuntimeException e) {
    super(e);
  }

}
