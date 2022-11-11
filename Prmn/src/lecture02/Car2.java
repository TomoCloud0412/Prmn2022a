package lecture02;

public class Car2{
        int fuel;

        Tire[] tires = new Tire[4];
        Engine engine = new Engine();

        Car2(Tire[] tires, Engine engine){
            this.fuel = 0;
            this.tires = tires;
            this.engine = engine;
        }
        void run(){
            if(fuel != 0){
                System.out.println("燃料を1消費して走りました");
            }else{
                System.out.println("燃料が足りないため走れませんでした");
            }

        }
        void startEngine(){
            engine.start();
        }


}
