package lecture02;

public class Exercise2_3 {
    public static void main(String[] args) {
        Tire[] tires = new Tire[4];
        for( Tire i : tires){
            Tire t= new Tire(65);
        }
        Engine engine = new Engine(4000);
        Car2 car = new Car2(tires, engine);
        GasStation gasStation = new GasStation();
        gasStation.refuel(car);
        car.startEngine();
        car.run();

    }
}
