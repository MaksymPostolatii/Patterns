package creational.abstractfactory.tank;

import creational.abstractfactory.vehiclefactory.EnginePart;

public class TankEightCylinderEngine implements EnginePart {
    public void createEngine() {
        System.out.println("Eight-cylinder engine for TankFactory created");
    }
}
