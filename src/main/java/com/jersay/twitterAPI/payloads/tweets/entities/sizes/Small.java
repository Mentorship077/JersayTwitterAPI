
package com.jersay.twitterAPI.payloads.tweets.entities.sizes;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "w",
    "h",
    "resize"
})
public class Small {

    @JsonProperty("w")
    private Integer w;
    @JsonProperty("h")
    private Integer h;
    @JsonProperty("resize")
    private String resize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("w")
    public Integer getW() {
        return w;
    }

    @JsonProperty("w")
    public void setW(Integer w) {
        this.w = w;
    }

    @JsonProperty("h")
    public Integer getH() {
        return h;
    }

    @JsonProperty("h")
    public void setH(Integer h) {
        this.h = h;
    }

    @JsonProperty("resize")
    public String getResize() {
        return resize;
    }

    @JsonProperty("resize")
    public void setResize(String resize) {
        this.resize = resize;
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
