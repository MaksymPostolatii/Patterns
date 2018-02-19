package behavioral.strategy.tamagotchi;

import behavioral.strategy.activity.Eating;
import behavioral.strategy.activity.Playing;
import behavioral.strategy.activity.Sleeping;

public class TamagotchiRunner {
    public static void main(String[] args) {
        Tamagotchi tamagotchi = new Tamagotchi("ピカチュウ [Pikachu]");
        sleep(tamagotchi);
        eat(tamagotchi);
        play(tamagotchi);
        sleep(tamagotchi);
    }

    private static void sleep(Tamagotchi tamagotchi) {
        tamagotchi.setActivity(new Sleeping());
        tamagotchi.executeActivity();
    }

    private static void eat(Tamagotchi tamagotchi) {
        tamagotchi.setActivity(new Eating());
        tamagotchi.executeActivity();
    }

    private static void play(Tamagotchi tamagotchi) {
        tamagotchi.setActivity(new Playing());
        tamagotchi.executeActivity();
    }
}
