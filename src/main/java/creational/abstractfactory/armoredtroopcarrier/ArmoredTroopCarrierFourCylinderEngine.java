package creational.abstractfactory.armoredtroopcarrier;

import creational.abstractfactory.vehiclefactory.EnginePart;

public class ArmoredTroopCarrierFourCylinderEngine implements EnginePart {
    public void createEngine() {
        System.out.println("Four cylinder engine for ArmoredTroopCarrierFactory created");
    }
}
