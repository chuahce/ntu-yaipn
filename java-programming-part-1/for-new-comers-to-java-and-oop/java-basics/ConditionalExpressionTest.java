/* 
 * Test conditional expression ( ... ? ... : ... )
 */

public class ConditionalExpressionTest {

  public static void main (String[] args) {
    int num1 = 9, num2 = 8, max;
    max = (num1 > num2) ? num1 : num2; // RHS returns num1 or num2
    // same as
    if (num1 > num2) {
      max = num1;
    } else {
      max = num2;
    }

    System.out.println("Max is " + max);

    int value = -9, absValue;
    absValue = (value > 0) ? value : -value; // RHS returns value or -value
    // same as
    if (value > 0) {
      absValue = value;
    } else {
      absValue = -value;
    }

    /* 
    if (value > 0) absValue = value;
    else absValue = -value;
     */

    System.out.println("Absolute value is " + absValue);

    int mark = 48;
    System.out.println((mark >= 50) ? "PASS" : "FAIL"); // Return "PASS" or "FAIL"
    // same as
    if (mark >= 50) {
      System.out.println("PASS");
    } else {
      System.out.println("FAIL");
    }
    /* 
    if (mark >= 50) System.out.println("PASS");
    else System.out.println("FAIL");
     */
  }
}

/* A conditional operator is a ternary (3-operand) operator, in the form of booleanExpr ? trueExpr : falseExpr. Depending on the booleanExpr, it evaluates and returns the value of trueExpr or falseExpr. */

/* Conditional expression is a short-hand for if-else. But you should use it only for one-liner, for readability. */

/*
* Try to visualize and draw the flow chart of conditional expression
*/