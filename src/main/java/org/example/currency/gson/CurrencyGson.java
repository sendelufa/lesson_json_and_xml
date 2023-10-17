package org.example.currency.gson;

import com.google.gson.annotations.SerializedName;

import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Optional;

public record CurrencyGson(

        @SerializedName("Date")
        ZonedDateTime date,

        @SerializedName("Timestamp")
        ZonedDateTime timestamp,

        @SerializedName("Valute")
        Map<String, CurrencyDetailsGson> valutes

) {
    public Optional<CurrencyDetailsGson> findByCode(String code) {
        return Optional.ofNullable(valutes.get(code));
    }
}
