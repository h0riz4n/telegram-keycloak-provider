package ru.kwagga;

import org.keycloak.broker.provider.AbstractIdentityProvider;
import org.keycloak.models.FederatedIdentityModel;
import org.keycloak.models.KeycloakSession;

import jakarta.ws.rs.core.Response;
import ru.kwagga.config.TelegramIdentityProviderConfig;

public class TelegramIdentityProvider extends AbstractIdentityProvider<TelegramIdentityProviderConfig> {

    public TelegramIdentityProvider(KeycloakSession session, TelegramIdentityProviderConfig config) {
        super(session, config);
    }

    @Override
    public Response retrieveToken(KeycloakSession session, FederatedIdentityModel identity) {
        throw new UnsupportedOperationException("Telegram do not provide user tokens");
    }
}
