```Java

/* Class Definition in Java */
public class Circle { // class name
  double radius;      // variables
  String color;

  double getRadius() { ...... } // methods
  double getArea() { ...... }
}


public class SoccerPlayer {   // class name
  int number;                 // variables
  String name;
  int x,y;

  void run() { ...... }       // methods
  void kickBall() { ...... }
}

[AccessControlModifier] class Classname {
    // Class body contains members (variables and methods)
    ......
}

/* Creating Instances of a Class*/
// Declare 3 instances of the class Circle, c1, c2, and c3
Circle c1, c2, c3;    // They hold a special value called null
// Construct the instances via new operator
c1 = new Circle();
c2 = new Circle(2.0);
c3 = new Circle(3.0, "red");

// You can Declare and Construct in the same statement
Circle c4 = new Circle();

/* Dot (.) Operator */
// Suppose that the class Circle has variables radius and color,
// and methods getArea() and getRadius().
// Declare and construct instances c1 and c2 of the class Circle
Circle c1 = new Circle();
Circle c2 = new Circle();
// Invoke member methods for the instance c1 via dot operator
System.out.println(c1.getArea());
System.out.println(c1.getRadius());
// Reference member variables for instance c2 via dot operator
c2.radius = 5.0;
c2.color = "blue";

/* Member Variables */
[AccessControlModifier] type variableName [= initial value];
[AccessControlModifier] type variableName-1 [= initialValue-1] [, type variableName-2 [= initialValue-2]] ... ;

private double radius;
public int length = 1, width = 1;

/* Member Methods */
[AccessControlModifier] returnType methodName ([parameterList]) {
    // method body or implementation
    ......
}

// Return the area of this Circle instance
public double getArea() {
  return radius * radius * Math.PI;
}

/* Constructors */
Circle c1 = new Circle();            // use 1st constructor
Circle c2 = new Circle(2.0);         // use 2nd constructor
Circle c3 = new Circle(3.0, "red");  // use 3rd constructor

/* Overloading Circle Class' Constructor */
Circle()  // the default constructor
Circle(double r)
Circle(double r, String c)

/* The Access Control Modifiers: public/private */
/* Information Hiding and Encapsulation */

/* The public Getters/Setters for private Variables */
// Setter for color
public void setColor(String newColor) {
   color = newColor;
}
   
// Setter for radius
public void setRadius(double newRadius) {
   radius = newRadius;
}

/* Keyword "this" */
public class Circle {
   double radius;                 // member variable called "radius"
   public Circle(double radius) { // method's parameter also called "radius"
      this.radius = radius;
         // "radius = radius" does not make sense!
         // "this.radius" refers to this instance's member variable
         // "radius" resolved to the method's parameter.
   }
   ...
}

// Using the keyword "this", the constructor, getter and setter methods for a private variable called xxx of type T are as follows:
public class Ccc {
   // A private variable named xxx of the type T
   private T xxx;
 
   // Constructor
   public Ccc(T xxx) {
      this.xxx = xxx;
   }
 
   // A getter for variable xxx of type T receives no argument and return a value of type T
   public T getXxx() {
      return xxx;  // or "return this.xxx" for clarity
   }
 
   // A setter for variable xxx of type T receives a parameter of type T and return void
   public void setXxx(T xxx) {
      this.xxx = xxx;
   }
}

// For a boolean variable xxx, the getter shall be named isXxx() or hasXxx(), which is more meaningful than getXxx(). The setter remains as setXxx().
// private boolean variable
private boolean xxx;
 
// getter
public boolean isXxx() {
   return xxx;  // or "return this.xxx" for clarity
}
 
// setter
public void setXxx(boolean xxx) {
   this.xxx = xxx;
}

/* More on "this" */
this.varName refers to varName of this instance; this.methodName(...) invokes methodName(...) of this instance.
In a constructor, we can use this(...) to call another constructor of this class.
Inside a method, we can use the statement "return this" to return this instance to the caller.

/* Method toString() */
// Return a String description of this instance
public String toString() {
   return "Circle[radius=" + radius + ",color=" + color + "]";
}

Circle c4 = new Circle();
System.out.println(c4.toString());   // Explicitly calling toString()
//Circle[radius=1.0,color=red]
System.out.println(c4);              // Implicit call to c4.toString()
//Circle[radius=1.0,color=red]
System.out.println("c4 is: " + c4);  // '+' invokes toString() to get a String before concatenation
//Circle[radius=1.0,color=red]

/* Constants (final) */
public final double X_REFERENCE = 1.234;
 
private final int MAX_ID = 9999;
MAX_ID = 10000;  //compilation error: cannot assign a value to final variable MAX_ID
 
// You need to initialize a final member variable during declaration
private final int SIZE;    //compilation error: variable SIZE might not have been initialized

```
