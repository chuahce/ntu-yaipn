/*
 * Print the area and perimeter of a rectangle, given its length and width (in doubles).
 */

public class RectangleComputation {

  public static void main(String[] Args){ // Entry point
    // Declare 4 double variables to hold length, width, area and perimeter
    // A "double" holds floating-point number with an optional fractional part.
    double length, width, area, perimeter;

    length = 3.8; // Assign a value to length. (We shall learn to to write a code to read in the value from the keyboard later.)
    width = 4.5; // Assign a value to width

    // Compute area and perimeter
    area = length * width;
    perimeter = (2 * length) + (2 * width);

    // Print results
    System.out.print("The area is "); // Print the description
    System.out.println(area); // Print the value stored in the variable
    System.out.print("The perimeter is ");
    System.out.println(perimeter);
  }
}
