package com.jersay.twitterAPI.api;

import com.jersay.twitterAPI.payloads.tweets.HomeTimeLine;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.client.oauth1.AccessToken;
import org.glassfish.jersey.client.oauth1.ConsumerCredentials;
import org.glassfish.jersey.client.oauth1.OAuth1ClientSupport;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Feature;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;

import static com.jersay.twitterAPI.constants.TwitterAPIConsts.*;

public class Auth1BaseApi {
    private static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in, Charset.forName("UTF-8")));


    private static final String COSUMER_KEY = "QK6tJzbhiYgqq9C2eRI8UuIvz";
    private static final String COSUMER_SEKRET_KEY = "gZfMQ8dHr9e8xCidS92NaFFSlRWelurLBNnh03HKN7i2bKJEde";

    private static final String ACCESS_TOKEN = "971038894115475457-6kSyriaT8V4m4NKdoudgYaFXoRuic2h";
    private static final String ACCESS_TOKEN_SECRET = "0EQcJyjOjAbaUa8m9r4lNuWtgiYMlPvqDRwEUUw9d6yhe";

        public Client getAuth() {
        ConsumerCredentials consumerCredentials = new ConsumerCredentials(COSUMER_KEY, COSUMER_SEKRET_KEY);
        Feature filterFeature;
        AccessToken accessToken1 = new AccessToken(ACCESS_TOKEN, ACCESS_TOKEN_SECRET);
        filterFeature = OAuth1ClientSupport.builder(consumerCredentials).feature()
                .accessToken(accessToken1).build();

        return ClientBuilder.newBuilder()
               .register(filterFeature)
               .register(JacksonFeature.class)
               .build();
    }

}
