package creational.abstractfactory.armoredtroopcarrier;

import creational.abstractfactory.vehiclefactory.BodyPart;

public class ArmoredTroopCarrierLightArmoredBody implements BodyPart {
    public void createBody() {
        System.out.println("Light armored body for ArmoredTroopCarrierFactory created");
    }
}
