public class Person{
    //fields
    private int destination;
    private boolean direction; //true for Right, false for Left
    private int startLocation;

    //constructor
    public Person(int myDestination, int myStart){
        destination = myDestination; 
        startLocation = myStart;
        if(destination > startLocation){
            direction = true;
        } else {
            direction = false;
        }
    }

    //methods
    public int getDestination(){
        return destination; 
    }
    public boolean getDirection(){
        return direction;
    }
    public int getStart(){
        return startLocation;
    }
    public String toString(){
        return "\n" + super.toString() + "\n" + "(a)Start: " + startLocation + "\n" + "(b)Destination: " + destination + "\n" + "(c)Going right? " + direction + "\n";
    }
}