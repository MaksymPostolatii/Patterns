package behavioral.strategy.activity;

public class Eating implements Activity {
    @Override
    public void doActivity(String tamagotchiName) {
        System.out.println(tamagotchiName + " eating...");
    }
}
