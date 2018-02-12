package structural.bridge.car;

import structural.bridge.engineer.Engineer;

public abstract class Engine {
    Engineer engineer;

    Engine(Engineer engineer) {
        this.engineer = engineer;
    }

    public abstract void createEngine();
}
