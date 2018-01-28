package creational.factory.chocolatefactory;

import creational.factory.chocolate.Chocolate;
import creational.factory.chocolate.DarkChocolate;

public class DarkChocolateFactory extends ChocolateFactory {
    public DarkChocolateFactory(int cocoaContent) {
        super(cocoaContent);
    }

    public Chocolate createChocolateFactory() {
        return new DarkChocolate();
    }
}
