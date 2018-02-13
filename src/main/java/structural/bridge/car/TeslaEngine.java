package structural.bridge.car;

import structural.bridge.engineer.Engineer;

public class TeslaEngine extends Engine {
    public TeslaEngine(Engineer engineer) {
        super(engineer);
    }

    public void createEngine() {
        System.out.println("Tesla engine creation in progress...");
        engineer.createSparePart();
    }
}
