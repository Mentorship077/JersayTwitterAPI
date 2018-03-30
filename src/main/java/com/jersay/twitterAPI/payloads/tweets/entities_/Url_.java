
package com.jersay.twitterAPI.payloads.tweets.entities_;

import com.fasterxml.jackson.annotation.*;
import com.jersay.twitterAPI.payloads.tweets.entities_.url_.Url__;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "urls"
})
public class Url_ {

    @JsonProperty("urls")
    private List<Url__> urls = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("urls")
    public List<Url__> getUrls() {
        return urls;
    }

    @JsonProperty("urls")
    public void setUrls(List<Url__> urls) {
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
