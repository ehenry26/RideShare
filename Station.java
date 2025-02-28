import java.util.*;
public class Station {
    //fields
    private int num;
    private ArrayList<Person> standByL; //waiting person
    private ArrayList<Person> standByR; //waiting person
    private ArrayList<Person> taken; //taken person


    //constructor
    public Station(int myNum){
        num = myNum;
        standByL = new ArrayList<Person>();
        standByR = new ArrayList<Person>();
        taken = new ArrayList<Person>();
    }


    //methods
    public void addPerson(Person p){
        if(p.getDestination() == num){
            taken.add(p);
        } else if(p.getDirection()){
            standByR.add(p);
        } else {
            standByL.add(p);
        }
    }
    /**
     * Method for giving back a person who is going rightbound.
     * @return a single person traveling to the right-- returns null if nobody is avaliable
     */
    //next right person
    public Person getnextR(){
        if(standByR.size() > 0){
            return standByR.remove(0);
        } else {
            return null;
        }
    }

    /**
     * Method for giving back a person who is going leftbound.
     * @return a single person traveling to the left-- returns null if nobody is avaliable
     */
    //next right person
    public Person getnextL(){
        if(standByL.size() > 0){
            return standByL.remove(0);
        } else {
            return null;
        }
    }

    public int takenCount(){
        return taken.size();
    }

    public String toString(){
        String s = "Station: " + num + "\n";
        s += "Rightbound: " + standByR.toString() + "\n";
        s += "Leftbound: " + standByL.toString() + "\n";
        s += "Taken: " + taken.toString();
        return s;
    }
    
}
