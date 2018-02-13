package structural.decorator;

import structural.decorator.tv.Television;

public class TelevisionDecorator implements Television {
    private Television television;

    public TelevisionDecorator(Television television) {
        this.television = television;
    }

    @Override
    public String showPrograms() {
        return television.showPrograms();
    }
}
