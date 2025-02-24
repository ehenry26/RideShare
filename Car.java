import java.util.*;
public class Car {
    //fields
    private int destination;
    private int currentLocation;
    private boolean direction;
    private ArrayList<Person> passengers;

    //constructor
    public Car(int myDestination, int myStart){
        destination = myDestination;
        currentLocation = myStart;
        direction = destination > currentLocation;
        passengers = new ArrayList<Person>();
    }
    
    //methods
    public void addPassenger(Person p){
        if(passengers.size() >= 3){
            System.out.println("ERROR: No Room!");
        } else {
            passengers.add(p);
        }
    }

    public boolean hasRoom(){
        return passengers.size() < 3;
    }

    public String toString(){
        return super.toString() + "\n" + "Destination: " + destination + ", Current Location: " + currentLocation + 
        ", Going Right? " + direction + ", Passengers:" + passengers + "\n";
    }
}
