package behavioral.strategy.tamagotchi;

import behavioral.strategy.activity.Activity;

public class Tamagotchi {
    private Activity activity;
    private String tamagotchiName;

    Tamagotchi(String tamagotchiName) {
        this.tamagotchiName = tamagotchiName;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.doActivity(tamagotchiName);
    }
}
