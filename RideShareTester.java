public class RideShareTester {
    public static void main(String[] args) {
        Road r = new Road();
        System.out.println(r.toString());
        System.out.println("/n");
        r.fillCars(5);
        r.fillStations(10);
        System.out.println("-----------");
        System.out.println(r);
        r.move();
        System.out.println(r);
        System.out.println("-----------" );
        r.move();
        r.move();
        r.move();
        r.move();
        System.out.println(r);
        
    }
}
