import java.util.ArrayList;

class Person {
  // This is class represents a list of coordinate locations
  // of a particular cell phone on a given day. 

  private ArrayList<Point> locations;

  // Default constructor - builds empty list
  Person() {
    locations = new ArrayList<Point> ();
  }


// Helper method to calculate the distance between two points using 
// the distance formula
  private double distance (Point p1, Point p2) {

    // If you have forgotten your geometry, look here: 
    // https://www.khanacademy.org/math/basic-geo/basic-geometry-pythagorean-theorem/pythagorean-theorem-distance/a/distance-formula

    // *************************   
    // **** Write code here ****
    // *************************   

    // You will obviously have to change this return value
    return 0;
  }


  // Calculate the length of the diagonal between 
  // the corners of the box tha includes the all of the 
  // points in the ArrayList locations
  public double calcDiagonalofMaxBox () {

    // If you forgot how to calculate minimum or maximum, look here
    // https://beginnersbook.com/2014/07/java-finding-minimum-and-maximum-values-in-an-array/

    // The two points at the upper left and
    // lower right corners of the box. 
    
    // You can modify these constructors if you want
    Point max = new Point(), min = new Point();

    // *************************   
    // **** Write code here ****
    // *************************   
    
    // Use the distance method to return the distance 
    return distance (max, min);
  }

  public String toString () {
      // Generic toString to print out the list of locations
      String output = "Locations: ";
      for (Point p : locations) {
        output += p.toString();
      }
      return output;
  }

  // Constructs list based on a list of
  // x coordinates and y coordinates
  Person (double x[], double y[]) {
    // Call the default constructor to build an empty list
    this(); 
    // check to make sure we have the same number of x's and y's
    if (x.length != y.length)
      throw (new IllegalArgumentException("x and y coordinate lists have unequal length"));

    // create a list of points
    for (int i=0; i<x.length; i++) {
      locations.add (new Point(x[i], y[i]));
    }
  }

}