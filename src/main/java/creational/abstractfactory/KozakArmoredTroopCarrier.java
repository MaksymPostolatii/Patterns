package creational.abstractfactory;

import creational.abstractfactory.armoredtroopcarrier.ArmoredTroopCarrierFactory;
import creational.abstractfactory.vehiclefactory.*;

public class KozakArmoredTroopCarrier {
    public static void main(String[] args) {
        MilitaryVehicleFactory militaryVehicleFactory = new ArmoredTroopCarrierFactory();
        BodyPart kozakBodyPart = militaryVehicleFactory.getBodyPart();
        EnginePart kozakEnginePart = militaryVehicleFactory.getEnginePart();
        TierPart kozakTierPart = militaryVehicleFactory.getTierPart();
        WeaponPart kozakWeaponPart = militaryVehicleFactory.getWeaponPart();
        createKozak(kozakBodyPart, kozakEnginePart, kozakTierPart, kozakWeaponPart);
    }

    private static void createKozak(BodyPart bodyPart, EnginePart enginePart,
                                    TierPart tierPart, WeaponPart weaponPart) {
        System.out.println("Creating Kozak armored troop carrier...");
        bodyPart.createBody();
        enginePart.createEngine();
        tierPart.createTier();
        weaponPart.createWeapon();
        System.out.println("Kozak created!");
    }
}
