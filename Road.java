import java.util.ArrayList;

public class Road {
    //fields
     private Station[] stations;
     private ArrayList<Car> cars;
     
     
     private static final int NUMSTATIONS = 10;


    //constructor
    public Road(){
        stations = new Station[NUMSTATIONS];
        for(int i = 0; i < stations.length; i++){
            stations[i] = new Station(i);
        }
        cars = new ArrayList<Car>();
    }

    //methods
    /**
     * Method for moving all cars- left and right- if they meet requirements
     * I received help from Kelly on this part
     * 02/28/2025
     */
   // public void moveAll(){
        //for(Car car : cars){
            //while(car.hasRoom()){
                //if(car.getCurrentLocation() > car.getDestination() && stations.get(car.getCurrentLocation()).getnextL() != null){
                    //car.addPassenger(stations.get(car.getCurrentLocation()).getnextL());

                //} else if (car.getCurrentLocation() > car.getDestination() && stations.get(car.getCurrentLocation()).getnextR() != null){
                    //car.addPassenger(stations.get((car.getCurrentLocation()).getnextR());
                //} else{
                    //break;
                //}
            //}
        //}
        //}

    //POPULATE STATIONS
    public void fillStations(int numPeople){
        for(int i = 0; i < numPeople; i++){
            int start = (int)(Math.random() * NUMSTATIONS);
            int stop = (int)(Math.random() * NUMSTATIONS);
            stations[start].addPerson(new Person(stop,start));

        }
    }
    //POPULATE CARS
    public void fillCars(int numCars){
        for(int i = 0; i < numCars; i++){
            int start = (int)(Math.random() * NUMSTATIONS);
            int stop = (int)(Math.random() * NUMSTATIONS);
            cars.add(new Car(stop, start));

        }
    }

    public String toString(){
        String s = "";
        for(Station st : stations){
            s += st.toString();
            s += "\n";
        }
        s += "Cars: \n";
        for(Car c : cars){
            s += c.toString();
            s += "\n";
        }
        return s;
    }
    /**
     * This is the big method that moves all cars, unloads and loads passengers for one 'tick'
     * 
     */
    public void move(){
        //unload all eligible people from cars to stations
        for(Car c : cars){
            //this gives an eligible person to remove or null if nobody is available 
            while(true){
            Person p = c.unload();
            if(p != null){
                int location = c.getCurrentLocation();
                stations[location].addPerson(p);
            } else {
                break;
            }
        }
    }
        //load all eligible people from stations to cars
        //going to be similar, but now looping through stations and putting in cars

        //move all the cars
        for(Car c : cars){
            c.move();
        }

        
    }

    }

