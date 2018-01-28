package creational.factory.chocolatefactory;

import creational.factory.chocolate.Chocolate;

public abstract class ChocolateFactory {
    private int cocoaContent;

    ChocolateFactory(int cocoaContent) {
        this.cocoaContent = cocoaContent;
    }

    public int getCocoaContent() {
        return cocoaContent;

    }

    public abstract Chocolate createChocolateFactory();
}
