/*
 * Write a program called CylinderComputation to print the surface area, base area, and volume of a cylinder, given its radius and height (in doubles). You should use 5 double variables called radius, height, surfaceArea, baseArea and volume. Take note that space (blank) is not allowed in variable names.
 */

/*
 * Print the surface area, base area, and volume of a cylinder given its radius and height
 */

public class CylinderComputation {

  public static void main(String[] Args){ // Entry point
    // Declare 5 double variables to hold radius, height, surfaceArea, baseArea and volume
    double radius, height, surfaceArea, baseArea, volume;

    radius = 2.2; // Assign a value to radius
    height = 6.2; // Assign  a value to height
    final double PI = 3.14159265; // Declare a double to hold PI

    // Compute the base area, surface area and volume
    baseArea = PI * radius * radius; 
    surfaceArea = (2 * PI * radius) * height + 2 * baseArea;
    volume = baseArea * height;

    System.out.println("The base area is " + baseArea);
    System.out.println("The surface area is " + surfaceArea);
    System.out.println("The volume is " + volume);
  }
}


