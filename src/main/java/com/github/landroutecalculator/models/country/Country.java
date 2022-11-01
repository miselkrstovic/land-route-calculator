
package com.github.landroutecalculator.models.country;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.landroutecalculator.services.astar.GraphNode;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "tld",
    "cca2",
    "ccn3",
    "cca3",
    "cioc",
    "independent",
    "status",
    "unMember",
    "currencies",
    "idd",
    "capital",
    "altSpellings",
    "region",
    "subregion",
    "languages",
    "translations",
    "latlng",
    "landlocked",
    "borders",
    "area",
    "flag",
    "demonyms"
})
@Generated("jsonschema2pojo")
public class Country implements GraphNode {

    @JsonProperty("name")
    private Name name;
    @JsonProperty("tld")
    private List<String> tld = null;
    @JsonProperty("cca2")
    private String cca2;
    @JsonProperty("ccn3")
    private String ccn3;
    @JsonProperty("cca3")
    private String cca3;
    @JsonProperty("cioc")
    private String cioc;
    @JsonProperty("independent")
    private Boolean independent;
    @JsonProperty("status")
    private String status;
    @JsonProperty("unMember")
    private Boolean unMember;
    @JsonProperty("currencies")
    private Currencies currencies;
    @JsonProperty("idd")
    private Idd idd;
    @JsonProperty("capital")
    private List<String> capital = null;
    @JsonProperty("altSpellings")
    private List<String> altSpellings = null;
    @JsonProperty("region")
    private String region;
    @JsonProperty("subregion")
    private String subregion;
    @JsonProperty("languages")
    private Languages languages;
    @JsonProperty("translations")
    private Translations translations;
    @JsonProperty("latlng")
    private List<Double> latlng = null;
    @JsonProperty("landlocked")
    private Boolean landlocked;
    @JsonProperty("borders")
    private List<Object> borders = null;
    @JsonProperty("area")
    private Integer area;
    @JsonProperty("flag")
    private String flag;
    @JsonProperty("demonyms")
    private Demonyms demonyms;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@Override
	public String getId() {
		return cca3;
	}
	
    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    @JsonProperty("tld")
    public List<String> getTld() {
        return tld;
    }

    @JsonProperty("tld")
    public void setTld(List<String> tld) {
        this.tld = tld;
    }

    @JsonProperty("cca2")
    public String getCca2() {
        return cca2;
    }

    @JsonProperty("cca2")
    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    @JsonProperty("ccn3")
    public String getCcn3() {
        return ccn3;
    }

    @JsonProperty("ccn3")
    public void setCcn3(String ccn3) {
        this.ccn3 = ccn3;
    }

    @JsonProperty("cca3")
    public String getCca3() {
        return cca3;
    }

    @JsonProperty("cca3")
    public void setCca3(String cca3) {
        this.cca3 = cca3;
    }

    @JsonProperty("cioc")
    public String getCioc() {
        return cioc;
    }

    @JsonProperty("cioc")
    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    @JsonProperty("independent")
    public Boolean getIndependent() {
        return independent;
    }

    @JsonProperty("independent")
    public void setIndependent(Boolean independent) {
        this.independent = independent;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("unMember")
    public Boolean getUnMember() {
        return unMember;
    }

    @JsonProperty("unMember")
    public void setUnMember(Boolean unMember) {
        this.unMember = unMember;
    }

    @JsonProperty("currencies")
    public Currencies getCurrencies() {
        return currencies;
    }

    @JsonProperty("currencies")
    public void setCurrencies(Currencies currencies) {
        this.currencies = currencies;
    }

    @JsonProperty("idd")
    public Idd getIdd() {
        return idd;
    }

    @JsonProperty("idd")
    public void setIdd(Idd idd) {
        this.idd = idd;
    }

    @JsonProperty("capital")
    public List<String> getCapital() {
        return capital;
    }

    @JsonProperty("capital")
    public void setCapital(List<String> capital) {
        this.capital = capital;
    }

    @JsonProperty("altSpellings")
    public List<String> getAltSpellings() {
        return altSpellings;
    }

    @JsonProperty("altSpellings")
    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("subregion")
    public String getSubregion() {
        return subregion;
    }

    @JsonProperty("subregion")
    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    @JsonProperty("languages")
    public Languages getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    @JsonProperty("translations")
    public Translations getTranslations() {
        return translations;
    }

    @JsonProperty("translations")
    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    @JsonProperty("latlng")
    public List<Double> getLatlng() {
        return latlng;
    }

    @JsonProperty("latlng")
    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    @JsonProperty("landlocked")
    public Boolean getLandlocked() {
        return landlocked;
    }

    @JsonProperty("landlocked")
    public void setLandlocked(Boolean landlocked) {
        this.landlocked = landlocked;
    }

    @JsonProperty("borders")
    public List<Object> getBorders() {
        return borders;
    }

    @JsonProperty("borders")
    public void setBorders(List<Object> borders) {
        this.borders = borders;
    }

    @JsonProperty("area")
    public Integer getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(Integer area) {
        this.area = area;
    }

    @JsonProperty("flag")
    public String getFlag() {
        return flag;
    }

    @JsonProperty("flag")
    public void setFlag(String flag) {
        this.flag = flag;
    }

    @JsonProperty("demonyms")
    public Demonyms getDemonyms() {
        return demonyms;
    }

    @JsonProperty("demonyms")
    public void setDemonyms(Demonyms demonyms) {
        this.demonyms = demonyms;
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
