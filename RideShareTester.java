public class RideShareTester {
    public static void main(String[] args) {
        Road r = new Road();
        System.out.println(r.toString());
        r.fillCars(5);
        r.fillStations(10);
        System.out.println("-----------");
        System.out.println(r);
        r.move();
        System.out.println(r);

        
    }
}
