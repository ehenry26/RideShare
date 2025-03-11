public class RideShareTester {
    public static void main(String[] args) {
        Road r = new Road();
        r.fillCars(40);
        r.fillStations(50);
        System.out.println("---------------");
        System.out.println("Before moving:" + "\n---------------" + "\n" + r.toString());
        for(int i = 0; i <= 32; i++){
            r.move();
        }
        System.out.println("---------------");
        System.out.println("After moving: " + "\n---------------"+ "\n" + r);
        

        System.out.println("\n" + "Number of Completed Passengers: " + r.finishedRoute() + "/50");
    }
}
