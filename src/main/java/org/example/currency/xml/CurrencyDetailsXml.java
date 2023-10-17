package org.example.currency.xml;

import org.example.parser.adapter.StringToDoubleAdapter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Objects;

public final class CurrencyDetailsXml {
    private String id;
    private Integer numCode;
    private String charCode;
    private Double value;

    public CurrencyDetailsXml() {
    }

    @XmlAttribute(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement(name = "NumCode")
    public Integer getNumCode() {
        return numCode;
    }

    public void setNumCode(Integer numCode) {
        this.numCode = numCode;
    }

    @XmlElement(name = "CharCode")
    public String getCharCode() {
        return charCode;
    }

    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    @XmlElement(name = "Value")
    @XmlJavaTypeAdapter(StringToDoubleAdapter.class)
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        var that = (CurrencyDetailsXml) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.numCode, that.numCode) &&
                Objects.equals(this.charCode, that.charCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numCode, charCode);
    }

    @Override
    public String toString() {
        return "CurrencyDetailsXml[" +
                "id=" + id + ", " +
                "numCode=" + numCode + ", " +
                "charCode=" + charCode + ']';
    }

}
