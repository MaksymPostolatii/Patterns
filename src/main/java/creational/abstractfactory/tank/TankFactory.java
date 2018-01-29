package creational.abstractfactory.tank;

import creational.abstractfactory.vehiclefactory.*;

public class TankFactory implements MilitaryVehicleFactory {
    public BodyPart getBodyPart() {
        return new TankHeavyArmoredBody();
    }

    public EnginePart getEnginePart() {
        return new TankEightCylinderEngine();
    }

    public TierPart getTierPart() {
        return new TankCaterpillar();
    }

    public WeaponPart getWeaponPart() {
        return new TankCannon();
    }
}
