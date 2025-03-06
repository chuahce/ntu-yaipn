/* *
 * Test literals for various primitive types
 */
public class LiteralTest {
  public static void main(String[] args){
    String name = "Tan Ah Teck";  // String is double-quoted
    char gender = 'm';            // char is single-quoted
    boolean isMarried = true;     // boolean of either true or false
    int numberOfChildren = 8;     // Or use byte, range of byte is [-127, 128]
    int yearOfBirth = 1945;       // Or use short, range of short is [-32767, 32768]. Beyond byte
    int salary = 88000;           // Beyond the ranges of byte and short
    long netAsset = 8234567890L;  // Need suffix 'L' for long. Beyond int
    float weight = 88.88f;        // With fractional part, Or use double, 
    float gpa = 3.88f;            // Need suffix 'f' for float

    // println() can be used to print value of any type
    System.out.println("Name is: " + name);
    //Name is: Tan Ah Teck
    System.out.println("Gender is: " + gender);
    //Gender is: m
    System.out.println("Is married is: " + "isMarried" );
    //Is married is: true
    System.out.println("Number od children is: " + "numberOfChildren");
    //Number of children is: 8
    System.out.println("Year of birth is: " + "yearOfBirth");
    //Year of birth is: 1945
    System.out.println("Salary is: " + salary);
    //Salary is: 88000
    System.out.println("Net Asset is: " + netAsset);
    //Net Asset is: 8234567890
    System.out.println("Weight is: " + weight);
    //Weight is: 88.88
    System.out.println("GPA is: " + gpa);
    //GPA is: 3.88
  }
}
