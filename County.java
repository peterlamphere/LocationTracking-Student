import java.util.ArrayList;

class County {
  // Contains a list of people in a county on a particular day
  // with their locations. 
  ArrayList<Person> people;
  County () {people = new ArrayList<Person> ();}

  public double avgDistanceTraveled () {
    //This method should return the average distance traveled
    // using the method calcDiagonalofMaxBox, 
    // for each person in the ArrayList people
    
    // You can assume at least one person in the county.
    
    // *************************   
    // **** Write code here ****
    // *************************   

    // Obviously, you will need to change this return value
    return 0;
  }

  public String toString() {
    // Prints out all the people in the county
    if (people.size() == 0) return "No people in county";
      else {
        String output = "";
        int counter = 1;
          for (Person p : people) {
               output += "Person " + counter + " ";
              output += p.toString() + "\n";
              counter++;
          }
          return output;

      }

  }
  // Mutator method to add a person in
  public void add (Person p) {people.add(p);}

  // Accessor method to return the population
  public int population() {
    return people.size();
  }
}