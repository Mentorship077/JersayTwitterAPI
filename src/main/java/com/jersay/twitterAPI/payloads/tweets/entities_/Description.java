
package com.jersay.twitterAPI.payloads.tweets.entities_;

import com.fasterxml.jackson.annotation.*;
import com.twitterAPI.payloads.tweets.entities_.description.Url___;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "urls"
})
public class Description {

    @JsonProperty("urls")
    private List<Url___> urls = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("urls")
    public List<Url___> getUrls() {
        return urls;
    }

    @JsonProperty("urls")
    public void setUrls(List<Url___> urls) {
        this.urls = urls;
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
