package behavioral.memento;

import static java.lang.System.out;
import static java.lang.Thread.sleep;

public class SaveGameRunner {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        Savings savings = new Savings();
        out.println("Starting new game..");
        setGameData(game, "Prepare to fight with boss..");
        saveGame(game, savings);
        sleep(3000);
        setGameData(game, "Fighting with boss..");
        out.println("Game over..");
        loadGame(game, savings);
    }

    private static void setGameData(Game game, String gameData) {
        game.setGameData(gameData);
        out.println(game);
    }

    private static void saveGame(Game game, Savings savings) {
        out.println("Saving game..");
        savings.setSave(game.saveGame());
        out.println("Game saved\nContinue playing..");
    }

    private static void loadGame(Game game, Savings savings) {
        out.println("Load game..");
        game.loadGame(savings.getSave());
        out.println("Game loaded");
        out.println(game);
    }
}
