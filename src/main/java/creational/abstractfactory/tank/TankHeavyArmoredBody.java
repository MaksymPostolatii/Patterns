package creational.abstractfactory.tank;

import creational.abstractfactory.vehiclefactory.BodyPart;

public class TankHeavyArmoredBody implements BodyPart {
    public void createBody() {
        System.out.println("Heavy armored body part for TankFactory created");
    }
}
