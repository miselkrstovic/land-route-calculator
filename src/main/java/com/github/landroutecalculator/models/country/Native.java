
package com.github.landroutecalculator.models.country;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nld",
    "pap"
})
@Generated("jsonschema2pojo")
public class Native {

    @JsonProperty("nld")
    private Nld nld;
    @JsonProperty("pap")
    private Pap pap;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nld")
    public Nld getNld() {
        return nld;
    }

    @JsonProperty("nld")
    public void setNld(Nld nld) {
        this.nld = nld;
    }

    @JsonProperty("pap")
    public Pap getPap() {
        return pap;
    }

    @JsonProperty("pap")
    public void setPap(Pap pap) {
        this.pap = pap;
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
