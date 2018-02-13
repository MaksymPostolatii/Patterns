package structural.proxy;

import static java.lang.System.out;

public class ProxyVideo implements Video {
    private YoutubeVideo youtubeVideo;
    private String url;

    ProxyVideo(String url) {
        this.url = url;
    }

    @Override
    public void show() {
        if (youtubeVideo == null) youtubeVideo = new YoutubeVideo(url);
        else out.println("Video already entered in search field...");
        youtubeVideo.show();
    }
}
