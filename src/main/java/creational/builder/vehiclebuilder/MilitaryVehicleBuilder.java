package creational.builder.vehiclebuilder;

public abstract class MilitaryVehicleBuilder {
    MilitaryVehicle militaryVehicle;

    void createMilitaryVehicle() {
        militaryVehicle = new MilitaryVehicle();
    }

    abstract void buildName();
    abstract void buildTier();
    abstract void buildBody();
    abstract void buildWeapon();
    abstract void buildTurret();

    public MilitaryVehicle getMilitaryVehicle() {
        return militaryVehicle;
    }
}
