package patterns.factory.sailorboat;

import patterns.factory.BoatFactory;

public class SailorBoatFactory extends BoatFactory {
    @Override
    public SailorBoat createBoat() {
        return new SailorBoat();
    }
}
