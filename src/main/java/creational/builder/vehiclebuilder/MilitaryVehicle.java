package creational.builder.vehiclebuilder;

import creational.builder.enums.Tier;
import creational.builder.enums.VehicleBody;

import static java.lang.String.format;

public class MilitaryVehicle {
    private String name;
    private Tier tier;
    private VehicleBody body;
    private String weapon;
    private String turret;

    public void setName(String name) {
        this.name = name;
    }

    public void setTurret(String turret) {
        this.turret = turret;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setBody(VehicleBody body) {
        this.body = body;
    }

    public void setTier(Tier tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return format("MilitaryVehicle { name = %s, tier = %s, body = %s, weapon = '%s', turret = '%s'}",
                name, tier, body, weapon, turret);
    }
}
