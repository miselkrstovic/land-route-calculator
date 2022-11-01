
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
    "ces",
    "deu",
    "est",
    "fin",
    "fra",
    "hrv",
    "hun",
    "ita",
    "jpn",
    "kor",
    "nld",
    "per",
    "pol",
    "por",
    "rus",
    "slk",
    "spa",
    "swe",
    "urd",
    "zho"
})
@Generated("jsonschema2pojo")
public class Translations {

    @JsonProperty("ces")
    private Ces ces;
    @JsonProperty("deu")
    private Deu deu;
    @JsonProperty("est")
    private Est est;
    @JsonProperty("fin")
    private Fin fin;
    @JsonProperty("fra")
    private Fra fra;
    @JsonProperty("hrv")
    private Hrv hrv;
    @JsonProperty("hun")
    private Hun hun;
    @JsonProperty("ita")
    private Ita ita;
    @JsonProperty("jpn")
    private Jpn jpn;
    @JsonProperty("kor")
    private Kor kor;
    @JsonProperty("nld")
    private Nld__1 nld;
    @JsonProperty("per")
    private Per per;
    @JsonProperty("pol")
    private Pol pol;
    @JsonProperty("por")
    private Por por;
    @JsonProperty("rus")
    private Rus rus;
    @JsonProperty("slk")
    private Slk slk;
    @JsonProperty("spa")
    private Spa spa;
    @JsonProperty("swe")
    private Swe swe;
    @JsonProperty("urd")
    private Urd urd;
    @JsonProperty("zho")
    private Zho zho;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ces")
    public Ces getCes() {
        return ces;
    }

    @JsonProperty("ces")
    public void setCes(Ces ces) {
        this.ces = ces;
    }

    @JsonProperty("deu")
    public Deu getDeu() {
        return deu;
    }

    @JsonProperty("deu")
    public void setDeu(Deu deu) {
        this.deu = deu;
    }

    @JsonProperty("est")
    public Est getEst() {
        return est;
    }

    @JsonProperty("est")
    public void setEst(Est est) {
        this.est = est;
    }

    @JsonProperty("fin")
    public Fin getFin() {
        return fin;
    }

    @JsonProperty("fin")
    public void setFin(Fin fin) {
        this.fin = fin;
    }

    @JsonProperty("fra")
    public Fra getFra() {
        return fra;
    }

    @JsonProperty("fra")
    public void setFra(Fra fra) {
        this.fra = fra;
    }

    @JsonProperty("hrv")
    public Hrv getHrv() {
        return hrv;
    }

    @JsonProperty("hrv")
    public void setHrv(Hrv hrv) {
        this.hrv = hrv;
    }

    @JsonProperty("hun")
    public Hun getHun() {
        return hun;
    }

    @JsonProperty("hun")
    public void setHun(Hun hun) {
        this.hun = hun;
    }

    @JsonProperty("ita")
    public Ita getIta() {
        return ita;
    }

    @JsonProperty("ita")
    public void setIta(Ita ita) {
        this.ita = ita;
    }

    @JsonProperty("jpn")
    public Jpn getJpn() {
        return jpn;
    }

    @JsonProperty("jpn")
    public void setJpn(Jpn jpn) {
        this.jpn = jpn;
    }

    @JsonProperty("kor")
    public Kor getKor() {
        return kor;
    }

    @JsonProperty("kor")
    public void setKor(Kor kor) {
        this.kor = kor;
    }

    @JsonProperty("nld")
    public Nld__1 getNld() {
        return nld;
    }

    @JsonProperty("nld")
    public void setNld(Nld__1 nld) {
        this.nld = nld;
    }

    @JsonProperty("per")
    public Per getPer() {
        return per;
    }

    @JsonProperty("per")
    public void setPer(Per per) {
        this.per = per;
    }

    @JsonProperty("pol")
    public Pol getPol() {
        return pol;
    }

    @JsonProperty("pol")
    public void setPol(Pol pol) {
        this.pol = pol;
    }

    @JsonProperty("por")
    public Por getPor() {
        return por;
    }

    @JsonProperty("por")
    public void setPor(Por por) {
        this.por = por;
    }

    @JsonProperty("rus")
    public Rus getRus() {
        return rus;
    }

    @JsonProperty("rus")
    public void setRus(Rus rus) {
        this.rus = rus;
    }

    @JsonProperty("slk")
    public Slk getSlk() {
        return slk;
    }

    @JsonProperty("slk")
    public void setSlk(Slk slk) {
        this.slk = slk;
    }

    @JsonProperty("spa")
    public Spa getSpa() {
        return spa;
    }

    @JsonProperty("spa")
    public void setSpa(Spa spa) {
        this.spa = spa;
    }

    @JsonProperty("swe")
    public Swe getSwe() {
        return swe;
    }

    @JsonProperty("swe")
    public void setSwe(Swe swe) {
        this.swe = swe;
    }

    @JsonProperty("urd")
    public Urd getUrd() {
        return urd;
    }

    @JsonProperty("urd")
    public void setUrd(Urd urd) {
        this.urd = urd;
    }

    @JsonProperty("zho")
    public Zho getZho() {
        return zho;
    }

    @JsonProperty("zho")
    public void setZho(Zho zho) {
        this.zho = zho;
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
