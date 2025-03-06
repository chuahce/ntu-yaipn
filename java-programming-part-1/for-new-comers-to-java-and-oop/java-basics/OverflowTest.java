/* *
 * Illustrate "int" overflow
 */
public class OverflowTest {
  public static void main(String[] args) {
    // Range of int is [-2147483648, 2147483647]
    int i1 = 2147483647;
    System.out.println(i1 + 1);
    System.out.println(i1 + 2);  //-2147483647 (overflow)
    System.out.println(i1 + 3);  //-2147483646 (overflow)
    System.out.println(i1 * 2);  //-2 (overflow)
    System.out.println(i1 * i1);  //1 (overflow)
      
    int i2 = -2147483648;         // minimum int
    System.out.println(i2 - 1);   //2147483647 (overflow)
    System.out.println(i2 - 2);   //2147483646 (overflow)
    System.out.println(i2 * i2);  //0 (overflow)
   }
}