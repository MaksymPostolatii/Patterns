package creational.abstractfactory.vehiclefactory;

public interface MilitaryVehicleFactory {
    BodyPart getBodyPart();

    EnginePart getEnginePart();

    TierPart getTierPart();

    WeaponPart getWeaponPart();
}
