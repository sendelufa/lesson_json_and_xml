package org.example.currency.jackson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CurrencyDetailsJackson(
        @JsonProperty("ID")
        String id,
        @JsonProperty("NumCode")
        Integer numCode,
        @JsonProperty("CharCode")
        String charCode,
        @JsonProperty("Value")
        BigDecimal value,
        @JsonProperty("Name")
        String name
) {
}
