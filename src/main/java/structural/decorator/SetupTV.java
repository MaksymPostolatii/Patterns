package structural.decorator;

import structural.decorator.tv.OldTV;
import structural.decorator.tv.SatelliteTV;
import structural.decorator.tv.SmartTV;
import structural.decorator.tv.Television;

import static java.lang.System.*;

public class SetupTV {
    public static void main(String[] args) {
        Television TV = new SmartTV(new SatelliteTV(new OldTV()));
        out.println(TV.showPrograms());
    }
}
