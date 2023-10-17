package org.example.currency.gson;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public record CurrencyDetailsGson(
        @SerializedName("ID")
        String id,
        @SerializedName("NumCode")
        Integer numCode,
        @SerializedName("CharCode")
        String charCode,
        @SerializedName("Value")
        BigDecimal value,
        @SerializedName("Name")
        String name
) {
}
