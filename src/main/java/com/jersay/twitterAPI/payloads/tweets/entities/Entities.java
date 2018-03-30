package com.jersay.twitterAPI.payloads.tweets.entities;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "hashtags",
        "symbols",
        "user_mentions",
        "urls",
        "media"
})
public class Entities {

    @JsonProperty("hashtags")
    private List<Object> hashtags = null;
    @JsonProperty("symbols")
    private List<Object> symbols = null;
    @JsonProperty("user_mentions")
    private List<Object> userMentions = null;
    @JsonProperty("urls")
    private List<Url> urls = null;
    @JsonProperty("media")
    private List<Medium> media = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hashtags")
    public List<Object> getHashtags() {
        return hashtags;
    }

    @JsonProperty("hashtags")
    public void setHashtags(List<Object> hashtags) {
        this.hashtags = hashtags;
    }

    @JsonProperty("symbols")
    public List<Object> getSymbols() {
        return symbols;
    }

    @JsonProperty("symbols")
    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    @JsonProperty("user_mentions")
    public List<Object> getUserMentions() {
        return userMentions;
    }

    @JsonProperty("user_mentions")
    public void setUserMentions(List<Object> userMentions) {
        this.userMentions = userMentions;
    }

    @JsonProperty("urls")
    public List<Url> getUrls() {
        return urls;
    }

    @JsonProperty("urls")
    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    @JsonProperty("media")
    public List<Medium> getMedia() {
        return media;
    }

    @JsonProperty("media")
    public void setMedia(List<Medium> media) {
        this.media = media;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Entities{" +
                "hashtags=" + hashtags +
                ", symbols=" + symbols +
                ", userMentions=" + userMentions +
                ", urls=" + urls +
                ", media=" + media +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}

