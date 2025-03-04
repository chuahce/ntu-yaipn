/* *
 * Test literals for various primitive types
 */

public class LiteralTest {
  public static void main(String[] args){
    String name = "Tan Ah Teck"; 
    char gender = 'm';
    boolean isMarried = true;
    int numberOfChildren = 8; // or use byte
    int yearOfBirth = 1945; // or use short
    int salary = 88000; 
    long netAsset = 8234567890L;
    float weight = 88.88f;
    float gpa = 3.88f;

    System.out.println("Name is: " + name);
    System.out.println("Gender is: " + gender);
    System.out.println("Is married is: " + "isMarried" );
    System.out.println("Number od children is: " + "numberOfChildren");
    System.out.println("Year of birth is: " + "yearOfBirth");
    System.out.println("Salary is: " + salary);
    System.out.println("Net Asset is: " + netAsset);
    System.out.println("Weight is: " + weight);
    System.out.println("GPA is: " + gpa);
  }
}
