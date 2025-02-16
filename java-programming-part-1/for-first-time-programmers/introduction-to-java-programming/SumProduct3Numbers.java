/*
 * Write a program called SumProduct3Numbers, which introduces one more int variable called number3, and assign it an integer value of 77. Compute and print the sum and product of all the three numbers.
 */

 /*
  * Print the sum and product of there numbers
  */

 public class SumProduct3Numbers {
 
  public static void main(String[] Args){ // Entry point

    // Declare 3 integer variables and assign values
    int number1 = 98;
    int number2 = 5;
    int number3 = 22;

    int sum; // Declare an integer variable sum to hold sum
    sum = number1 + number2 + number3; // Compute sum
    int product; // Declare an integer variable product to hold product
    product = number1 * number2 * number3; // Compute product

    System.out.println("The sum is " + sum);
    System.out.println("The product is " + product);
  }
 }