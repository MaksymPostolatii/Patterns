package creational.abstractfactory.tank;

import creational.abstractfactory.vehiclefactory.WeaponPart;

public class TankCannon implements WeaponPart {
    public void createWeapon() {
        System.out.println("105mm Cannon for TankFactory created");
    }
}
