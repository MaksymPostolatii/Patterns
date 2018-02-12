package creational.builder.vehiclebuilder;

import static creational.builder.enums.Tier.CATERPILLAR;
import static creational.builder.enums.VehicleBody.HEAVY_ARMORED_BODY;

public class TankBuilder extends MilitaryVehicleBuilder {
    void buildName() {
        militaryVehicle.setName("Tank");
    }

    void buildTier() {
        militaryVehicle.setTier(CATERPILLAR);
    }

    void buildBody() {
        militaryVehicle.setBody(HEAVY_ARMORED_BODY);
    }

    void buildWeapon() {
        militaryVehicle.setWeapon("122mm gun");
    }

    void buildTurret() {
        militaryVehicle.setTurret("Armored turret");
    }
}
