package ru.kwagga.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public record TelegramAuthData(
    String id,
    String firstName,
    String lastName,
    String username,
    String photoUrl,
    String authDate,
    String hash
) {

}
