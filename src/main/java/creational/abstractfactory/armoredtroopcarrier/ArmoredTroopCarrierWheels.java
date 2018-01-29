package creational.abstractfactory.armoredtroopcarrier;

import creational.abstractfactory.vehiclefactory.TierPart;

public class ArmoredTroopCarrierWheels implements TierPart{
    public void createTier() {
        System.out.println("Rubber wheels for ArmoredTroopCarrierFactory created");
    }
}
