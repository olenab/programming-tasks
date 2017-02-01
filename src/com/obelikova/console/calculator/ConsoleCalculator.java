package com.obelikova.console.calculator;

/**
 * a. Supported operations: +, -, /, *;
 * b. Number of operands: 2;
 * c. Input method: command line arguments (operation, operand1, operand2). Note: operands shall be real;
 * d. Output method: console (operand1 operation operand2 = result, i.e. "2 + 3 = 7" );
 * e. Unit tests shall cover all operations.
 */

public class ConsoleCalculator {

  public ConsoleCalculator() {}

  public static void main(String[] args) {
    double firstArg;
    double secondArg;
    double result;
    String operation = args[1];// What initial value should be?

    Operations action = new Operations();

    if (args.length > 0) {
      try {
        firstArg = Double.parseDouble(args[0]);
        secondArg = Double.parseDouble(args[2]);

        switch (operation) {
          case "+": {
            result = action.add(firstArg, secondArg);
            action.console(firstArg, operation, secondArg, result);
            break;
          }
          case "-": {
            result = action.subtract(firstArg, secondArg);
            action.console(firstArg, operation, secondArg, result);
            break;
          }
          case "*": {
            result = action.multiply(firstArg, secondArg);
            action.console(firstArg, operation, secondArg, result);
            break;
          }
          case "/": {
            try {
              result = action.divide(firstArg, secondArg);
              action.console(firstArg, operation, secondArg, result);
            } catch (DivisionByNullException ex) {
              System.err.println("Error message: " + ex.getMessage());
              ex.printStackTrace();
            }
            break;
          }
          default:
            System.out.println(operation + " is not allowed operation");
        }

      } catch (NumberFormatException e) {
        System.err.println("Argument" + args[0] + " must be real number.");
        System.err.println("Argument" + args[2] + " must be real number.");
        System.exit(1);
      }
    }


  }

}