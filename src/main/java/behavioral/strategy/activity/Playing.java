package behavioral.strategy.activity;

public class Playing implements Activity {
    @Override
    public void doActivity(String tamagotchiName) {
        System.out.println(tamagotchiName + " playing...");
    }
}
