package August;

public class AbstractParameterized {
    /*
In this example, we create a method with two parameters as length and width in TwoDShape abstract class,
plus two more abstract methods for draw and area of the rectangle. Then in our main class, we create
 another parametrized method with length and width parameters, then call draw method from TwoDShape abstract
 class and calculate the area of given rectangle.
Note:
length=10 and width=10
    in TwoDShape abstract class
    create private variable for length and width
    define a parametrized method and use length and width (double data type).
    Create a draw abstract method.
    Create a getArea method and return multiply the length and width as body.
    Go to Main class
    extends this class to abstract TwoDShape class
    define a new parametrized method for length and width.
    Create a draw method and print: Drawing Rectangle
    in the main method create an object from TwoDShape and pass 10 for length and 10 for width.
    call draw method by using created object.
    call getArea method by using created object and print area of rectangle
Expected Output:
Drawing Rectangle
Area of given rectangle = 100.0
     */
    private double length;
    private double width;
/*
    public Double TwoDShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

 */

    class rectangle {


    }
}
