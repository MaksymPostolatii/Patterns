package structural.bridge.car;

import structural.bridge.engineer.Engineer;

public class VolgaEngine extends Engine {
    public VolgaEngine(Engineer engineer) {
        super(engineer);
    }

    public void createEngine() {
        System.out.println("Volga engine creation in progress...");
        engineer.createSparePart();
    }
}
