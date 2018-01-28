package creational.factory.chocolate;

import static java.lang.String.format;

public class WhiteChocolate implements Chocolate {
    public void makeChocolate(int cocoaContent) {
        System.out.println(format("White chocolate created with %d%% cocoa%n", cocoaContent));
    }
}
