package creational.factory.chocolatefactory;

import creational.factory.chocolate.ChocolateDepartment;
import creational.factory.chocolate.DarkChocolateDepartment;

public class DarkChocolateFactory extends ChocolateFactory {
    public DarkChocolateFactory(int cocoaContent) {
        super(cocoaContent);
    }

    public ChocolateDepartment createChocolateFactory() {
        return new DarkChocolateDepartment();
    }
}
