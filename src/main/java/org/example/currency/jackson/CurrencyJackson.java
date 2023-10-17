package org.example.currency.jackson;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Optional;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CurrencyJackson(

        @JsonProperty("Date")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
        ZonedDateTime date,

        @JsonProperty("Timestamp")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
        ZonedDateTime timestamp,

        @JsonProperty("Valute")
        Map<String, CurrencyDetailsJackson> valutes

) {
    public Optional<CurrencyDetailsJackson> findByCode(String code) {
        return Optional.ofNullable(valutes.get(code));
    }
}
