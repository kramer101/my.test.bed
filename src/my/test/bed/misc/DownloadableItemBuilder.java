package my.test.bed.misc;

import java.net.URL;

public class DownloadableItemBuilder {
    private String timeOfDay;
    private String place;
    private URL url;

    public DownloadableItemBuilder timeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
        return this;
    }

    public DownloadableItemBuilder place(String place) {
        this.place = place;
        return this;
    }

    public DownloadableItemBuilder url(URL url) {
        this.url = url;
        return this;
    }


    public String getTimeOfDay() {
        return timeOfDay;
    }

    public String getPlace() {
        return place;
    }

    public URL getUrl() {
        return url;
    }

    public AppleVideoDownloader.DownloadableItem build() {
        return new AppleVideoDownloader.DownloadableItem(this);
    }
}