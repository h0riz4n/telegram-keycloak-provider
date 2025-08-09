package ru.kwagga;

import org.keycloak.broker.oidc.AbstractOAuth2IdentityProvider;
import org.keycloak.broker.provider.AbstractIdentityProviderFactory;
import org.keycloak.models.IdentityProviderModel;
import org.keycloak.models.KeycloakSession;

import ru.kwagga.config.TelegramIdentityProviderConfig;

public class TelegramIdentityProviderFactory extends AbstractIdentityProviderFactory<TelegramIdentityProvider> {

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    @Override
    public TelegramIdentityProvider create(KeycloakSession session, IdentityProviderModel model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public IdentityProviderModel createConfig() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createConfig'");
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }


}
