package patterns.factory;

import patterns.factory.motorboat.MotorBoatFactory;
import patterns.factory.sailorboat.SailorBoatFactory;

public class Main {

    public static void main(String[] args) {
        BoatFactory motorBoatFactory = new MotorBoatFactory();
        BoatFactory sailorBoatFactory = new SailorBoatFactory();

        Boat motorBoat = motorBoatFactory.createBoat();
        Boat sailorBoat = sailorBoatFactory.createBoat();

        for (int i = 0; i < 10; i++) {
            motorBoat.increaseSpeed();
            motorBoat.forward();
            motorBoat.print();
        }

        for (int i = 0; i < 10; i++) {
            sailorBoat.increaseSpeed();
            sailorBoat.forward();
            sailorBoat.print();
        }
    }
}
