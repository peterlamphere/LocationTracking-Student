class Point {
  // This class represents a point in the xy coordinate plane
  private double x, y;

  // Default constructor
  Point () {};

  // Initialize the coordinates to (x,y)
  Point (double x, double y) {
    this.x = x;
    this.y = y;
  }

  // Copies the point p
  Point (Point p) {
    x = p.getX(); y = p.getY();
  }

  // Accessors
  double getX() {return x;}
  double getY() {return y;}

  // Mutators
  void setX(double x) {this.x = x;}
  void setY(double y) {this.y = y;}

  //to String
  public String toString() {
    return "(" + x + ", " + y + ") ";
  }
}