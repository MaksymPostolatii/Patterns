package creational.factory.chocolatefactory;

import creational.factory.chocolate.Chocolate;
import creational.factory.chocolate.WhiteChocolate;

public class WhiteChocolateFactory extends ChocolateFactory {
    public WhiteChocolateFactory(int cocoaContent) {
        super(cocoaContent);
    }

    public Chocolate createChocolateFactory() {
        return new WhiteChocolate();
    }
}
