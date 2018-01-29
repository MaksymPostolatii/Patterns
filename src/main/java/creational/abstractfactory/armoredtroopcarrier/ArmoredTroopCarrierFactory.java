package creational.abstractfactory.armoredtroopcarrier;

import creational.abstractfactory.vehiclefactory.*;

public class ArmoredTroopCarrierFactory implements MilitaryVehicleFactory {
    public BodyPart getBodyPart() {
        return new ArmoredTroopCarrierLightArmoredBody();
    }

    public EnginePart getEnginePart() {
        return new ArmoredTroopCarrierFourCylinderEngine();
    }

    public TierPart getTierPart() {
        return new ArmoredTroopCarrierWheels();
    }

    public WeaponPart getWeaponPart() {
        return new ArmoredTroopCarrierPairedMachineGun();
    }
}
