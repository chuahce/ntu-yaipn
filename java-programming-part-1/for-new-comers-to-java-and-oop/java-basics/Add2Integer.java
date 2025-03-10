import java.util.Scanner;   // For keyboard input
/* 
 * 1. Prompt user for 2 integers
 * 2. Read inputs as "int"
 * 3. Compute their sum in "int"
 * 4. Print the result
 */
public class Add2Integer {    // Save as "Add2Integer.java"
  public static void main(String[] args) {    // Program entry point
    // Declare variables
    int number1, number2, sum;

    // Put up prompting messages and read inputs a "int"
    Scanner in = new Scanner(System.in);    // Scan the keyboard for input
    System.out.print("Enter first integer: ");    // Mo newline for prompting message
    number1 = in.nextInt();   // Read next input as "int"
    System.out.print("Enter second integer: ");
    number2 = in.nextInt();
    in.close();

    // Computer sum
    sum = number1 + number2;
    System.out.println("The sum is: " + sum);   // Print with newline
  }
}
