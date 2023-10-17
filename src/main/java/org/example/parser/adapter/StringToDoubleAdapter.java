package org.example.parser.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class StringToDoubleAdapter extends XmlAdapter<String, Double> {

    @Override
    public Double unmarshal(String value) throws Exception {
        // Convert the string value to a Double
        return Double.parseDouble(value.replace(",", "."));
    }

    @Override
    public String marshal(Double value) throws Exception {
        // Convert the Double value to a string
        return String.valueOf(value);
    }
}
