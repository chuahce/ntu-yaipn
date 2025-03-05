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






```
