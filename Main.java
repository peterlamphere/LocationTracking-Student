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
    
    System.out.println("Adding some sample data for Bronx County");
    County bronx = new County();
    double jhonny[][] = {
          {4.0, 4.5, 5.0, 3.0, 6.0, 5.3},
          {6.0, 2.0, 7.5, 4.0, 5.0, 2.3}
    };

    double angel[][] = {
          {2.0, 4.5, 5.0, 3.0, 5.0, 3.3},
          {1.5, 2.0, 9.0, 4.0, 5.0, 2.3}
    };

    bronx.add (new Person (jhonny[0],jhonny[1]));
    bronx.add (new Person (angel[0],angel[1]));

    // Print out the sample data
    System.out.print(bronx);
    System.out.println("Population: " + bronx.population());
    
    // Average distance should be 7.1713646268862945
    System.out.println("Average distance traveled: " + bronx.avgDistanceTraveled());

  }
}