package com.jersay.twitterAPI.api;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import static com.jersay.twitterAPI.constants.TwitterAPIConsts.PASSWORD;
import static com.jersay.twitterAPI.constants.TwitterAPIConsts.USERNAME;

public class AuthBaseApi {
    private static final String COSUMER_KEY = "QK6tJzbhiYgqq9C2eRI8UuIvz";
    private static final String COSUMER_SEKRET_KEY = "gZfMQ8dHr9e8xCidS92NaFFSlRWelurLBNnh03HKN7i2bKJEde";

    private static final String ACCESS_TOKEN = "971038894115475457-6kSyriaT8V4m4NKdoudgYaFXoRuic2h";
    private static final String ACCESS_TOKEN_SECRET = "0EQcJyjOjAbaUa8m9r4lNuWtgiYMlPvqDRwEUUw9d6yhe";


    public Client client = ClientBuilder.newClient(getAuth(USERNAME, PASSWORD));

    private ClientConfig getAuth(String username, String password) {
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basicBuilder()
                .nonPreemptive()
                .credentials(username, password)
                .build();

        ClientConfig clientConfig = new ClientConfig();
        clientConfig.register(feature);

        return clientConfig;
    }

}
