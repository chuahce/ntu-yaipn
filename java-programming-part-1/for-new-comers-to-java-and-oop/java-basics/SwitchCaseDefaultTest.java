/* Test switch-case-default */

/* 
// switch-case-default
switch (selector) {
   case value1:
      block1; break;
   case value2:
      block2; break;
   case value3:
      block3; break;
   ......
   case valueN:
      blockN; break;
   default: // not the above
      defaultBlock;
}
// next statement

// Selector Types:
// byte, short, int,
// char, String
*/

public class SwitchCaseDefaultTest {
  public static void main(String[] args) { // Program entry point
    // Print number in word
    int number = 3;
    switch (number) {   // "int" selector
      case 1:   // "int" value
        System.out.println("ONE"); break;
      case 2: 
        System.out.println("TWO"); break;
      case 3:
        System.out.println("THREE"); break;
      default:
        System.err.println("OTHER");  
    }

    // Select arithmetic operation
    char operator = '*';    // "char" selector
    int num1 = 5, num2 = 8, result;
    switch (operator) {
      case '+':   // "char" value
        result = num1 + num2; 
        System.out.println(result); break;
      case '-':
        result = num1 - num2; 
        System.out.println(result); break;
      case '*': 
        result = num1 * num2; 
        System.out.println(result); break;
      case '/':
        result = num1 / num2; 
        System.out.println(result); break;
      default:
        System.out.println("Unknown operator");
    }
  }
}

/*
* Try to visualize and draw the flow chart of switch-case-default
*/