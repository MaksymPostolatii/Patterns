package creational.factory.chocolatefactory;

import creational.factory.chocolate.ChocolateDepartment;
import creational.factory.chocolate.WhiteChocolateDepartment;

public class WhiteChocolateFactory extends ChocolateFactory {
    public WhiteChocolateFactory(int cocoaContent) {
        super(cocoaContent);
    }

    public ChocolateDepartment createChocolateFactory() {
        return new WhiteChocolateDepartment();
    }
}
