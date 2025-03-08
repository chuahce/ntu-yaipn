/* * Compute the average of running numbers 1 to 100 */
public class Average1To100 {
  public static void main(String[] args) {
    int sum = 0;
    double average;
    for (int number = 0; number <= 100; ++number) {
      sum += number;    // Final sum is int 1050
    }
    System.out.println("Sum is: " + sum);
    average = sum / 100;    // Won't work (average = 50.0 instead of 50.5)
    System.out.println("Average is: " + average); // Average is 50.0
  }
}

/* 
// Cast sum from int to double before division, double / int -> double / double -> double
average = (double)sum / 100; 
// Cast 100 from int to double before division, int / double -> double / double -> double
average = sum / (double)100;  
average = sum / 100.0;    // int / double -> double / double -> double              
average = (double)(sum / 100);   // Won't work. why?
 */