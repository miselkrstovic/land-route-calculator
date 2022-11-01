
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
public class Languages {

    @JsonProperty("nld")
    private String nld;
    @JsonProperty("pap")
    private String pap;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nld")
    public String getNld() {
        return nld;
    }

    @JsonProperty("nld")
    public void setNld(String nld) {
        this.nld = nld;
    }

    @JsonProperty("pap")
    public String getPap() {
        return pap;
    }

    @JsonProperty("pap")
    public void setPap(String pap) {
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
