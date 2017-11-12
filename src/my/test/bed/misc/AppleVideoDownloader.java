package my.test.bed.misc;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class AppleVideoDownloader {


    private static final String ROOT = System.getProperty("user.home") + "/Downloads/Apple_Videos";

    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        URL url = new URL("http://a1.phobos.apple.com/us/r1000/000/Features/atv/AutumnResources/videos/entries.json");

        List<Example> response = mapper.readValue(url,
                mapper.getTypeFactory()
                        .constructCollectionType(List.class, Example.class));

        response.forEach(example -> {

            List<Asset> assets = example.getAssets();
            assets.forEach(asset -> {
                try {
                    DownloadableItem item = buildItem(asset);
                    processAsset(item);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            });
        });



    }

    private static void processAsset(final DownloadableItem item) throws Exception {


        String fileName = FileUtils.getFile(item.getUrl().toURI().toString()).getName();

        Path pathToFile = Paths.get(ROOT, item.getPlace(), item.getTimeOfDay());

        Path pathCreated =  Files.createDirectories(pathToFile);

        //String absolutePath = pathCreated.toString();
        try (ByteArrayOutputStream fos = new ByteArrayOutputStream();
             ReadableByteChannel rbc = Channels.newChannel(item.getUrl().openStream())) {

             FileChannel.open(pathCreated.resolve(fileName),
                     StandardOpenOption.WRITE,
                     StandardOpenOption.CREATE)
                     .transferFrom(rbc, 0, Long.MAX_VALUE);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static DownloadableItem buildItem(final Asset asset) throws  Exception {

        DownloadableItemBuilder builder = new DownloadableItemBuilder();
        return
                builder.timeOfDay(Optional.of(asset.getTimeOfDay()).orElse("none"))
                .place(Optional.of(asset.getAccessibilityLabel()).orElse("none"))
                .url(new URL(asset.getUrl())).build();
    }

    static class DownloadableItem {
        private String timeOfDay;
        private String place;
        private URL url;


        public DownloadableItem(DownloadableItemBuilder builder) {
            this.timeOfDay = builder.getTimeOfDay();
            this.place = builder.getPlace();
            this.url = builder.getUrl();
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
    }



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "url",
            "accessibilityLabel",
            "type",
            "id",
            "timeOfDay"
    })
    public static class Asset {

        @JsonProperty("url")
        private String url;
        @JsonProperty("accessibilityLabel")
        private String accessibilityLabel;
        @JsonProperty("type")
        private String type;
        @JsonProperty("id")
        private String id;
        @JsonProperty("timeOfDay")
        private String timeOfDay;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        @JsonProperty("url")
        public void setUrl(String url) {
            this.url = url;
        }

        @JsonProperty("accessibilityLabel")
        public String getAccessibilityLabel() {
            return accessibilityLabel;
        }

        @JsonProperty("accessibilityLabel")
        public void setAccessibilityLabel(String accessibilityLabel) {
            this.accessibilityLabel = accessibilityLabel;
        }

        @JsonProperty("type")
        public String getType() {
            return type;
        }

        @JsonProperty("type")
        public void setType(String type) {
            this.type = type;
        }

        @JsonProperty("id")
        public String getId() {
            return id;
        }

        @JsonProperty("id")
        public void setId(String id) {
            this.id = id;
        }

        @JsonProperty("timeOfDay")
        public String getTimeOfDay() {
            return timeOfDay;
        }

        @JsonProperty("timeOfDay")
        public void setTimeOfDay(String timeOfDay) {
            this.timeOfDay = timeOfDay;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "id",
            "assets"
    })
    public static class Example {

        @JsonProperty("id")
        private String id;
        @JsonProperty("assets")
        private List<Asset> assets = null;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("id")
        public String getId() {
            return id;
        }

        @JsonProperty("id")
        public void setId(String id) {
            this.id = id;
        }

        @JsonProperty("assets")
        public List<Asset> getAssets() {
            return assets;
        }

        @JsonProperty("assets")
        public void setAssets(List<Asset> assets) {
            this.assets = assets;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }
}
