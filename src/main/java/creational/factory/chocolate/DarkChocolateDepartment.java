package creational.factory.chocolate;

import static java.lang.String.format;

public class DarkChocolateDepartment implements ChocolateDepartment {
    public void makeChocolate(int cocoaContent) {
        System.out.println(format("Dark chocolate created with %d%% cocoa%n", cocoaContent));
    }
}
