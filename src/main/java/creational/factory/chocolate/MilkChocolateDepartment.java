package creational.factory.chocolate;

import static java.lang.String.format;

public class MilkChocolateDepartment implements ChocolateDepartment {
    public void makeChocolate(int cocoaContent) {
        System.out.println(format("Milk chocolate created with %d%% cocoa%n", cocoaContent));
    }
}
