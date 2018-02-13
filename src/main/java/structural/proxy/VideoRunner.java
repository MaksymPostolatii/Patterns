package structural.proxy;

import static java.lang.System.out;

public class VideoRunner {
    public static void main(String[] args) {
        Video video = new ProxyVideo("https://www.youtube.com/watch?v=QZXc39hT8t4");
        video.show();
        out.println("\n=========================================\n\nShow again");
        video.show();
    }
}
