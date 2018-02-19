package behavioral.memento;

import java.util.Date;

public class Save {
    private final String gameStatus;
    private final Date date;

    Save(String gameStatus) {
        this.gameStatus = gameStatus;
        this.date = new Date();
    }

    public String getGameStatus() {
        return gameStatus;
    }

    public Date getDate() {
        return date;
    }
}
