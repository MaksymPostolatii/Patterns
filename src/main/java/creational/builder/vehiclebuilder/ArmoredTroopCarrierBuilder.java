package creational.builder.vehiclebuilder;

import static creational.builder.enums.Tier.*;
import static creational.builder.enums.VehicleBody.*;

public class ArmoredTroopCarrierBuilder extends MilitaryVehicleBuilder {
    void buildName() {
        militaryVehicle.setName("Armored troop carrier");
    }

    void buildTier() {
        militaryVehicle.setTier(WHEELS);
    }

    void buildBody() {
        militaryVehicle.setBody(LIGHT_ARMORED_BODY);
    }

    void buildWeapon() {
        militaryVehicle.setWeapon("Paired 7,62mm machine gun");
    }

    void buildTurret() {
        militaryVehicle.setTurret("Light armored turret");
    }
}
