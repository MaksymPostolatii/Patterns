package creational.factory.chocolate;

import static java.lang.String.format;

public class MilkChocolate implements Chocolate {
    public void makeChocolate(int cocoaContent) {
        System.out.println(format("Milk chocolate created with %d%% cocoa%n", cocoaContent));
    }
}
