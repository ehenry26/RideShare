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
        return super.toString() + "\n" + "Start: " + startLocation + ", Destination: " + destination + ", Going right? " + direction + "\n";
    }
}