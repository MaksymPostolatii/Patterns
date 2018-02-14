package structural.adapter;

public class PlayerAdapter implements MusicPlayer {
    private MediaPlayer mediaPlayer;

    PlayerAdapter(String audioFormat) {
        if (audioFormat.equalsIgnoreCase("mp4")) mediaPlayer = new PhilipsMediaPlayer();
    }

    @Override
    public void play(String audioFormat, String fileName) {
        if (audioFormat.equalsIgnoreCase("mp4")) mediaPlayer.playMp4(fileName);
    }
}
