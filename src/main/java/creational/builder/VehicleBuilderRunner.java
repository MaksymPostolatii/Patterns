package creational.builder;

import creational.builder.vehiclebuilder.ArmoredTroopCarrierBuilder;
import creational.builder.vehiclebuilder.Director;
import creational.builder.vehiclebuilder.MilitaryVehicle;
import creational.builder.vehiclebuilder.TankBuilder;

public class VehicleBuilderRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new ArmoredTroopCarrierBuilder());
        MilitaryVehicle vehicle = director.buildMilitaryVehicle();

        System.out.println(vehicle);
    }
}
