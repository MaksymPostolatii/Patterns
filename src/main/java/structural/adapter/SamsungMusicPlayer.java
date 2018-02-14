package structural.adapter;

import static java.lang.System.out;

public class SamsungMusicPlayer implements MusicPlayer {

    @Override
    public void play(String audioFormat, String fileName) {
        if (audioFormat.equalsIgnoreCase("mp3")) {
            out.printf("Playing mp3 file %s%n", fileName);
        } else if (audioFormat.equalsIgnoreCase("mp4")) {
            PlayerAdapter playerAdapter = new PlayerAdapter(audioFormat);
            playerAdapter.play(audioFormat, fileName);
        } else out.printf("Invalid format - \"%s\"!!!%n", audioFormat);
    }
}
