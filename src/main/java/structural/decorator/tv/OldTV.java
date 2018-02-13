package structural.decorator.tv;

public class OldTV implements Television{
    @Override
    public String showPrograms() {
        return "Show national channels";
    }
}
