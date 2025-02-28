import java.util.ArrayList;

public class Road {
    //fields
     private ArrayList<Station> stations;
     private ArrayList<Car> cars;
     private int numStations;


    //constructor
    public Road(int myNumStations){
        stations = new ArrayList<Station>();
        cars = new ArrayList<Car>();
        numStations = myNumStations; //is this supposed to be pre-set?
    }

    //methods
    /**
     * Method for moving all cars- left and right- if they meet requirements
     * I received help from Kelly on this part
     * 02/28/2025
     */
    public void moveAll(){
        for(Car car : cars){
            while(car.hasRoom()){
                if(car.getCurrentLocation() > car.getDestination() && stations.get(car.getCurrentLocation()).getnextL() != null){
                    car.addPassenger(stations.get(car.getCurrentLocation()).getnextL());

                } else if (car.getCurrentLocation() > car.getDestination() && stations.get(car.getCurrentLocation()).getnextR() != null){
                    car.addPassenger(stations.get(car.getCurrentLocation()).getnextR());
                } else{
                    break;
                }
            }
        }
        }

    }

