package creational.abstractfactory.armoredtroopcarrier;

import creational.abstractfactory.vehiclefactory.WeaponPart;

public class ArmoredTroopCarrierPairedMachineGun implements WeaponPart {
    public void createWeapon() {
        System.out.println("Paired 7,62mm machine gun for ArmoredTroopCarrierFactory created");
    }
}
