
package com.jersay.twitterAPI.payloads.tweets.extendedEntities;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "media"
})
public class ExtendedEntities {

    @JsonProperty("media")
    private List<Medium__> media = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("media")
    public List<Medium__> getMedia() {
        return media;
    }

    @JsonProperty("media")
    public void setMedia(List<Medium__> media) {
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

}
