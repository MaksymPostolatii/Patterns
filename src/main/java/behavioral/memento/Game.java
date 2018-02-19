package behavioral.memento;

import structural.adapter.SamsungMusicPlayer;

import java.util.Date;

public class Game {
    private String gameStatus;
    private Date date;

    public void setGameData(String gameStatus) {
        this.gameStatus = gameStatus;
        this.date = new Date();
    }

    public Save saveGame() {
        return new Save(gameStatus);
    }

    public void loadGame(Save save) {
        gameStatus = save.getGameStatus();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return String.format("Game: \n{gameStatus = '%s', date = %s}", gameStatus, date);
    }
}
