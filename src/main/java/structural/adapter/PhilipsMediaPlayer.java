package structural.adapter;

import static java.lang.System.out;

public class PhilipsMediaPlayer implements MediaPlayer {

    @Override
    public void playMp4(String fileName) {
        out.printf("Playing mp4 file %s%n", fileName);
    }
}
