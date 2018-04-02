
package com.jersay.twitterAPI.payloads.tweets.extendedEntities;

import com.fasterxml.jackson.annotation.*;
import com.twitterAPI.payloads.tweets.extendedEntities.medium.AdditionalMediaInfo;
import com.twitterAPI.payloads.tweets.extendedEntities.medium.Sizes_;
import com.twitterAPI.payloads.tweets.extendedEntities.medium.VideoInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "id_str",
    "indices",
    "media_url",
    "media_url_https",
    "url",
    "display_url",
    "expanded_url",
    "type",
    "sizes",
    "video_info",
    "additional_media_info"
})
public class Medium__ {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("indices")
    private List<Integer> indices = null;
    @JsonProperty("media_url")
    private String mediaUrl;
    @JsonProperty("media_url_https")
    private String mediaUrlHttps;
    @JsonProperty("url")
    private String url;
    @JsonProperty("display_url")
    private String displayUrl;
    @JsonProperty("expanded_url")
    private String expandedUrl;
    @JsonProperty("type")
    private String type;
    @JsonProperty("sizes")
    private Sizes_ sizes;
    @JsonProperty("video_info")
    private VideoInfo videoInfo;
    @JsonProperty("additional_media_info")
    private AdditionalMediaInfo additionalMediaInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("id_str")
    public String getIdStr() {
        return idStr;
    }

    @JsonProperty("id_str")
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    @JsonProperty("indices")
    public List<Integer> getIndices() {
        return indices;
    }

    @JsonProperty("indices")
    public void setIndices(List<Integer> indices) {
        this.indices = indices;
    }

    @JsonProperty("media_url")
    public String getMediaUrl() {
        return mediaUrl;
    }

    @JsonProperty("media_url")
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    @JsonProperty("media_url_https")
    public String getMediaUrlHttps() {
        return mediaUrlHttps;
    }

    @JsonProperty("media_url_https")
    public void setMediaUrlHttps(String mediaUrlHttps) {
        this.mediaUrlHttps = mediaUrlHttps;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("display_url")
    public String getDisplayUrl() {
        return displayUrl;
    }

    @JsonProperty("display_url")
    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    @JsonProperty("expanded_url")
    public String getExpandedUrl() {
        return expandedUrl;
    }

    @JsonProperty("expanded_url")
    public void setExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("sizes")
    public Sizes_ getSizes() {
        return sizes;
    }

    @JsonProperty("sizes")
    public void setSizes(Sizes_ sizes) {
        this.sizes = sizes;
    }

    @JsonProperty("video_info")
    public VideoInfo getVideoInfo() {
        return videoInfo;
    }

    @JsonProperty("video_info")
    public void setVideoInfo(VideoInfo videoInfo) {
        this.videoInfo = videoInfo;
    }

    @JsonProperty("additional_media_info")
    public AdditionalMediaInfo getAdditionalMediaInfo() {
        return additionalMediaInfo;
    }

    @JsonProperty("additional_media_info")
    public void setAdditionalMediaInfo(AdditionalMediaInfo additionalMediaInfo) {
        this.additionalMediaInfo = additionalMediaInfo;
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
