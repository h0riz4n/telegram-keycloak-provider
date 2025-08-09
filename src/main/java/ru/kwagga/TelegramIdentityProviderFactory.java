package ru.kwagga;

import java.util.Collections;
import java.util.List;

import org.keycloak.broker.provider.AbstractIdentityProviderFactory;
import org.keycloak.models.IdentityProviderModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.provider.ProviderConfigProperty;
import org.keycloak.provider.ProviderConfigurationBuilder;

import ru.kwagga.config.TelegramIdentityProviderConfig;


public class TelegramIdentityProviderFactory extends AbstractIdentityProviderFactory<TelegramIdentityProvider> {

    private final String IDENTITY_PROVIDER_ID = "telegram";
    private final String IDENTITY_PROVIDER_NAME = "Telegram";
    private final String HELP_TEXT = "Authenticator that allows you to login using Telegram Web Login Widget";

    public static final String AUTH_TIME_DELTA_CONFIG_NAME = "telegram_auth_time_delta";
    public static final String DEFAULT_AUTH_TIME_DELTA = "60";

    @Override
    public String getName() {
        return IDENTITY_PROVIDER_NAME;
    }

    @Override
    public String getHelpText() {
        return HELP_TEXT;
    }

    @Override
    public TelegramIdentityProvider create(KeycloakSession session, IdentityProviderModel model) {
        return new TelegramIdentityProvider(session, new TelegramIdentityProviderConfig(model));
    }

    @Override
    public IdentityProviderModel createConfig() {
        return new TelegramIdentityProviderConfig();
    }

    @Override
    public String getId() {
        return IDENTITY_PROVIDER_ID;
    }

    @Override
    public List<ProviderConfigProperty> getConfigProperties() {
        return ProviderConfigurationBuilder.create()
            .property()
            .name(AUTH_TIME_DELTA_CONFIG_NAME)
            .label("Auth time delta (in seconds)")
            .helpText("""
                The maximum delta (in seconds) between the time of successful authorization in Telegram ('auth_date' parameter) and the time of receive the authorization request in Keycloak.
                After this time, request will be considered expired, even if it contains valid data.
                This is necessary to avoid reuse of authorization data in case of leakage.
                """)
            .type(ProviderConfigProperty.STRING_TYPE)
            .secret(false)
            .required(true)
            .defaultValue(DEFAULT_AUTH_TIME_DELTA)
            .add()
            .build();
    }
}
