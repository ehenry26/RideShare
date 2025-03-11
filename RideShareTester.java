public class RideShareTester {
    public static void main(String[] args) {
        Road r = new Road();
        System.out.println("/n");
        r.fillCars(40);
        r.fillStations(50);
        System.out.println("Before: " + r.toString());
        for(int i = 0; i <= 32; i++){
            r.move();
        }
        System.out.println("After (32 moves): " + r);
        System.out.println(r.finishedRoute());
    }
}
