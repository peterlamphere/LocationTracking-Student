class Main {
  public static void main(String[] args) {
    // Client code to test your program with two people
    // from the Bronx

    // You do *NOT* need to modify this code. 
    // You need to write code in the following methods
    // A) Person.distance(Point p1, Point p2)
    // B) Person.calcDiagonalofMaxBox()
    // C) County.avgDistanceTraveled()


    System.out.println("Welcome to the data simulator");
   
    // Test the distance method. Should be 13.0
    System.out.println ("The distance between (0,0) and (5,12) is " + Person.distance (new Point(0,0), new Point(5,12)));

    // Test the data simulator
    System.out.println("Adding some sample data for Bronx County");
    County bronx = new County();

    // Sample person 1
    double jhonny[][] = {
          {4.0, 4.5, 5.0, 3.0, 6.0, 5.3},
          {6.0, 2.0, 7.5, 4.0, 5.0, 2.3}
    };
    // Lower right corner: 
    // Upper left corner: 

    // Sample person 2
    double angel[][] = {
          {2.0, 4.5, 5.0, 3.0, 5.0, 3.3},
          {1.5, 2.0, 9.0, 4.0, 5.0, 2.3}
    };
    // Lower right corner: 
    // Upper left corner: 


    bronx.add (new Person (jhonny[0],jhonny[1]));
    bronx.add (new Person (angel[0],angel[1]));

    // Print out the sample data
    System.out.print(bronx);
    System.out.println("Population: " + bronx.population());
    
    // Average distance should be 7.1713646268862945
    System.out.println("Average distance traveled: " + bronx.avgDistanceTraveled());

  }
}