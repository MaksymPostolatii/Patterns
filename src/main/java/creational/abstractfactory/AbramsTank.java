package creational.abstractfactory;

import creational.abstractfactory.tank.TankFactory;
import creational.abstractfactory.vehiclefactory.*;

public class AbramsTank {
    public static void main(String[] args) {
        MilitaryVehicleFactory militaryVehicleFactory = new TankFactory();
        BodyPart abramsBodyPart = militaryVehicleFactory.getBodyPart();
        EnginePart abramsEnginePart = militaryVehicleFactory.getEnginePart();
        TierPart abramsTierPart = militaryVehicleFactory.getTierPart();
        WeaponPart abramsWeaponPart = militaryVehicleFactory.getWeaponPart();
        createAbrams(abramsBodyPart, abramsEnginePart, abramsTierPart, abramsWeaponPart);
    }

    private static void createAbrams(BodyPart bodyPart, EnginePart enginePart,
                                     TierPart tierPart, WeaponPart weaponPart) {
        System.out.println("Creating Abrams tank...");
        bodyPart.createBody();
        enginePart.createEngine();
        tierPart.createTier();
        weaponPart.createWeapon();
        System.out.println("Abrams created!");
    }
}
