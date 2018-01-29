package creational.factory.chocolatefactory;

import creational.factory.chocolate.ChocolateDepartment;
import creational.factory.chocolate.MilkChocolateDepartment;

public class MilkChocolateFactory extends ChocolateFactory {
    public MilkChocolateFactory(int cocoaContent) {
        super(cocoaContent);
    }

    public ChocolateDepartment createChocolateFactory() {
        return new MilkChocolateDepartment();
    }
}
