package structural.proxy;

import static java.lang.System.out;

public class YoutubeVideo implements Video {
    private String url;

    YoutubeVideo(String url) {
        this.url = url;
        openVideoInChrome(url);
    }

    private void openVideoInChrome(String url) {
        out.printf("Enter the %s in google search field%n", url);
    }

    @Override
    public void show() {
        out.printf("Show video %s%n", url);
    }
}
