package behavioral.strategy.activity;

public class Sleeping implements Activity {
    @Override
    public void doActivity(String tamagotchiName) {
        System.out.println(tamagotchiName + " sleeping...");
    }
}
