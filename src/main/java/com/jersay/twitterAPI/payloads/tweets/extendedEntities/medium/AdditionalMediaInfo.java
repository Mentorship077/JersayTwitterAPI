
package com.jersay.twitterAPI.payloads.tweets.extendedEntities.medium;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "monetizable"
})
public class AdditionalMediaInfo {

    @JsonProperty("monetizable")
    private Boolean monetizable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("monetizable")
    public Boolean getMonetizable() {
        return monetizable;
    }

    @JsonProperty("monetizable")
    public void setMonetizable(Boolean monetizable) {
        this.monetizable = monetizable;
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
