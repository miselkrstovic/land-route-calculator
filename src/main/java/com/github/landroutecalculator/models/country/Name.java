
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
    "common",
    "official",
    "native"
})
@Generated("jsonschema2pojo")
public class Name {

    @JsonProperty("common")
    private String common;
    @JsonProperty("official")
    private String official;
    @JsonProperty("native")
    private Native _native;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("common")
    public String getCommon() {
        return common;
    }

    @JsonProperty("common")
    public void setCommon(String common) {
        this.common = common;
    }

    @JsonProperty("official")
    public String getOfficial() {
        return official;
    }

    @JsonProperty("official")
    public void setOfficial(String official) {
        this.official = official;
    }

    @JsonProperty("native")
    public Native getNative() {
        return _native;
    }

    @JsonProperty("native")
    public void setNative(Native _native) {
        this._native = _native;
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
