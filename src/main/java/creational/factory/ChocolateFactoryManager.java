package creational.factory;

import creational.factory.chocolate.ChocolateDepartment;
import creational.factory.chocolatefactory.ChocolateFactory;
import creational.factory.chocolatefactory.DarkChocolateFactory;
import creational.factory.chocolatefactory.MilkChocolateFactory;
import creational.factory.chocolatefactory.WhiteChocolateFactory;
import creational.factory.exception.CocoaException;

import static java.lang.String.format;

public class ChocolateFactoryManager {
    private static final int COCOA_CONTENT = 10;

    private static final int MIN_COCOA_BLACK = 45;
    private static final int MAX_COCOA_BLACK = 99;
    private static final int MIN_COCOA_MILK = 35;
    private static final int MAX_COCOA_MILK = 45;
    private static final int MIN_COCOA_WHITE = 0;
    private static final int MAX_COCOA_WHITE = 35;

    public static void main(String[] args) throws CocoaException {
        ChocolateFactory factory = makeChocolateByCocoaContent(COCOA_CONTENT);
        ChocolateDepartment chocolateDepartment = factory.createChocolateFactory();
        chocolateDepartment.makeChocolate(factory.getCocoaContent());
    }

    private static ChocolateFactory makeChocolateByCocoaContent(int cocoaContent) throws CocoaException {
        if (cocoaContent >= MIN_COCOA_BLACK && cocoaContent <= MAX_COCOA_BLACK)
            return new DarkChocolateFactory(cocoaContent);
        if (cocoaContent >= MIN_COCOA_MILK && cocoaContent < MAX_COCOA_MILK)
            return new MilkChocolateFactory(cocoaContent);
        if (cocoaContent > MIN_COCOA_WHITE && cocoaContent < MAX_COCOA_WHITE)
            return new WhiteChocolateFactory(cocoaContent);
        throw new CocoaException(format("chocolate with %d%% cocoa does not exist", cocoaContent));
    }
}
