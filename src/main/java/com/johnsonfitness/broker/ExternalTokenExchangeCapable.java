package com.johnsonfitness.broker;

import jakarta.ws.rs.core.MultivaluedMap;
import org.keycloak.broker.provider.BrokeredIdentityContext;
import org.keycloak.events.EventBuilder;

public interface ExternalTokenExchangeCapable {
    /**
     * Allow IdentityProviders to exchange a third-party issued token (access_token or id_token)
     * for a BrokeredIdentityContext to be linked to a Keycloak user.
     *
     * @param event     the Keycloak event logger
     * @param params    input parameters, typically includes "subject_token"
     * @return BrokeredIdentityContext populated with external user info
     * @throws Exception on failure
     */
    BrokeredIdentityContext exchangeExternalToken(EventBuilder event, MultivaluedMap<String, String> params) throws Exception;
}
