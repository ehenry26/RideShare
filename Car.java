import java.util.*;
public class Car {
    //fields
    private int destination;
    private int currentLocation;
    private boolean direction; //true for right, false for left
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
        } else if(p.getDirection() != direction){
            System.out.println("ERROR: Trying to add person in wrong direction!");
        }else{
            passengers.add(p);
        }
    }

    public void move(){
        if(currentLocation == destination){
            return; //kick out early before trying to move
        }

        if(direction == true){
            currentLocation++;
        } else {
            currentLocation--;
        }
    }
    /**
     * Method for handing back a person that is eligible to be dropped off.
     * This removes person from the car as well.
     * There may be multiple people eligible for dropoff but this only returns one.
     * @return one Person eligible to be dropped off, null if nobody is avaliable
     */
    public Person unload(){
        for(int i = 0; i < passengers.size(); i++){
            Person a = passengers.get(i);
            if(a.getDestination() == currentLocation || destination == currentLocation){
                return passengers.remove(i);
            }
        }
        return null;
    }
    public boolean getDirection(){
        return direction;
    }
    public boolean hasRoom(){
        return passengers.size() < 3;
    }

    public int getDestination(){
        return destination;
    }
    
    public int getCurrentLocation(){
        return currentLocation;
    }
    public String toString(){
        return super.toString() + "\n" + "Destination: " + destination + ", Current Location: " + currentLocation + 
        ", Going Right? " + direction + ", Passengers:" + passengers + "\n";
    }
}
