
package com.jersay.twitterAPI.payloads.tweets.extendedEntities.medium;

import com.fasterxml.jackson.annotation.*;
import com.twitterAPI.payloads.tweets.extendedEntities.medium.sizes.Large_;
import com.twitterAPI.payloads.tweets.extendedEntities.medium.sizes.Medium___;
import com.twitterAPI.payloads.tweets.extendedEntities.medium.sizes.Small_;
import com.twitterAPI.payloads.tweets.extendedEntities.medium.sizes.Thumb_;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "thumb",
    "small",
    "medium",
    "large"
})
public class Sizes_ {

    @JsonProperty("thumb")
    private Thumb_ thumb;
    @JsonProperty("small")
    private Small_ small;
    @JsonProperty("medium")
    private Medium___ medium;
    @JsonProperty("large")
    private Large_ large;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("thumb")
    public Thumb_ getThumb() {
        return thumb;
    }

    @JsonProperty("thumb")
    public void setThumb(Thumb_ thumb) {
        this.thumb = thumb;
    }

    @JsonProperty("small")
    public Small_ getSmall() {
        return small;
    }

    @JsonProperty("small")
    public void setSmall(Small_ small) {
        this.small = small;
    }

    @JsonProperty("medium")
    public Medium___ getMedium() {
        return medium;
    }

    @JsonProperty("medium")
    public void setMedium(Medium___ medium) {
        this.medium = medium;
    }

    @JsonProperty("large")
    public Large_ getLarge() {
        return large;
    }

    @JsonProperty("large")
    public void setLarge(Large_ large) {
        this.large = large;
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
