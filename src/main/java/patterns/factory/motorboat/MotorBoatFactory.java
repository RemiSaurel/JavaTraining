package patterns.factory.motorboat;

import patterns.factory.BoatFactory;

public class MotorBoatFactory extends BoatFactory {
    @Override
    public MotorBoat createBoat() {
        return new MotorBoat();
    }
}
