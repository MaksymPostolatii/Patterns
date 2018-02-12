package structural.bridge;

import structural.bridge.car.Engine;
import structural.bridge.car.TeslaEngine;
import structural.bridge.car.VolgaEngine;
import structural.bridge.engineer.ElectricEngineer;
import structural.bridge.engineer.MechanicEngineer;

import java.util.Arrays;

public class CarCreator {
    public static void main(String[] args) {
        Engine[] engines = {
                new TeslaEngine(new ElectricEngineer()),
                new VolgaEngine(new MechanicEngineer())
        };
        Arrays.stream(engines).forEach(Engine::createEngine);
    }
}
