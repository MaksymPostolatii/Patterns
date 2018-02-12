package creational.builder.vehiclebuilder;

public class Director {
        private MilitaryVehicleBuilder builder;

    public void setBuilder(MilitaryVehicleBuilder builder) {
        this.builder = builder;
    }

    public MilitaryVehicle buildMilitaryVehicle() {
        builder.createMilitaryVehicle();
        builder.buildName();
        builder.buildBody();
        builder.buildTier();
        builder.buildTurret();
        builder.buildWeapon();

        return builder.getMilitaryVehicle();
    }
}
