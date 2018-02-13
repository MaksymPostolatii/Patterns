package structural.decorator.tv;

import structural.decorator.TelevisionDecorator;

import static java.lang.String.*;

public class SmartTV extends TelevisionDecorator {
    public SmartTV(Television television) {
        super(television);
    }

    private String showNetflix() {
        return "Show Netflix";
    }

    @Override
    public String showPrograms() {
        return format("%s + %s", super.showPrograms(), showNetflix());
    }
}
