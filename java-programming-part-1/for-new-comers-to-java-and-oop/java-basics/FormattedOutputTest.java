/* 
 * Test formatted output printf().
 * printf(formattingString, arg1, arg2, arg3, ... );
 */

public class FormattedOutputTest {
  public static void main(String[] args) {
    // Without specifying field-width
    System.out.printf("Hi,|%s|%d|%f|,@xyz%n", "Hello", 123, 45.6);
    // Specifying the field-width and decimal places for double
    System.out.printf("Hi,|%6s|%6d|%6.2f|,@xyz%n", "Hello", 123, 45.6);
    // Various way to format integers:
    // flag '-' for left-align, '0' for padding with 0
    System.out.printf("Hi,|%d|%5d|%-5d|%05d|,@xyz%n", 111, 222, 333, 444);
    // Various way to format floating-point numbers:
    // flag '-' for left-align
    System.out.printf("Hi,|%f|%7.2f|%.2f|%-7.2f|,@xyz%n", 11.1, 22.2, 33.3, 44.4);
    // To print a '%', use %% (as % has special meaning)
    System.out.printf("The rate is: %.2f%%.%n", 1.2);
  }
}


