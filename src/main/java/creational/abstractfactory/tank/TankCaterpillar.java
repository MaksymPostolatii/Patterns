package creational.abstractfactory.tank;

import creational.abstractfactory.vehiclefactory.TierPart;

public class TankCaterpillar implements TierPart {
    public void createTier() {
        System.out.println("Caterpillar for TankFactory created");
    }
}
