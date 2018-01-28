package creational.factory.chocolatefactory;

import creational.factory.chocolate.Chocolate;
import creational.factory.chocolate.MilkChocolate;

public class MilkChocolateFactory extends ChocolateFactory {
    public MilkChocolateFactory(int cocoaContent) {
        super(cocoaContent);
    }

    public Chocolate createChocolateFactory() {
        return new MilkChocolate();
    }
}
