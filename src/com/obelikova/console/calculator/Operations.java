package com.obelikova.console.calculator;

public class Operations {
  private double operand1;
  private double operand2;
  private double result;
  private double operation;

  public Operations() {}

  public double add(double operand1, double operand2) {
    return result = operand1 + operand2;
  }

  public double subtract(double operand1, double operand2) {
    return result = operand1 - operand2;
  }

  public double multiply(double operand1, double operand2) {
    return result = operand1 * operand2;
  }

  public double divide(double operand1, double operand2) throws DivisionByNullException {
    if (operand2 == 0) {
      throw new DivisionByNullException("Division by 0 is forbidden");
    }
    else return result = operand1 / operand2;
  }

  // console (operand1 operation operand2 = result, i.e. "2 + 3 = 7" );
  public void console (double operand1, String operation, double operand2, double result) {
    System.out.println(operand1 + " " + operation + " " + operand2 + " = " + result);
  }
}