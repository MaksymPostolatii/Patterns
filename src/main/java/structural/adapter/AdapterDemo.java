package structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        SamsungMusicPlayer player = new SamsungMusicPlayer();

        player.play("mp3", "Snoop Dogg - The Next Episode.mp3");
        player.play("mp4", "The Nototrious B.I.G. - Who shot ya.mp4");
        player.play("vlc", "50 cent - Window Shopper.vlc");
    }
}
