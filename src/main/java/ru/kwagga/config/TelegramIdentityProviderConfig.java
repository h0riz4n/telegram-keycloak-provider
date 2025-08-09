package ru.kwagga.config;

import org.keycloak.broker.oidc.OAuth2IdentityProviderConfig;
import org.keycloak.models.IdentityProviderModel;

public class TelegramIdentityProviderConfig extends OAuth2IdentityProviderConfig {

    public TelegramIdentityProviderConfig(IdentityProviderModel model) {
        super(model);
    }
}
 