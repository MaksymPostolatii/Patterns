package structural.decorator.tv;

import structural.decorator.TelevisionDecorator;

import static java.lang.String.*;

public class SatelliteTV extends TelevisionDecorator {
    public SatelliteTV(Television television) {
        super(television);
    }

    private String showInternationalChannels() {
        return "Show international channels";
    }

    @Override
    public String showPrograms() {
        return format("%s + %s", super.showPrograms(), showInternationalChannels());
    }
}
