package com.jersay.twitterAPI.api;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.client.oauth1.AccessToken;
import org.glassfish.jersey.client.oauth1.ConsumerCredentials;
import org.glassfish.jersey.client.oauth1.OAuth1AuthorizationFlow;
import org.glassfish.jersey.client.oauth1.OAuth1ClientSupport;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Feature;
import javax.ws.rs.core.Response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import static com.jersay.twitterAPI.constants.TwitterAPIConsts.FRIENDS_TIMELINE_URI;
import static com.jersay.twitterAPI.constants.TwitterAPIConsts.PASSWORD;
import static com.jersay.twitterAPI.constants.TwitterAPIConsts.USERNAME;

public class AuthBaseApi {
    private static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in, Charset.forName("UTF-8")));


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

    public static void main(String[] args) {

        ConsumerCredentials consumerCredentials = new ConsumerCredentials(COSUMER_KEY,COSUMER_SEKRET_KEY);
        Feature filterFeature;

        final OAuth1AuthorizationFlow authFlow = OAuth1ClientSupport.builder(consumerCredentials)
                .authorizationFlow(
                        "https://api.twitter.com/oauth/request_token",
                        "https://api.twitter.com/oauth/access_token",
                        "https://api.twitter.com/oauth/authorize")
                .build();
        final String authorizationUri = authFlow.start();
        System.out.println(authorizationUri);
        final String verifier;

        try {
            verifier = IN.readLine();
        } catch (final IOException ex) {
            throw new RuntimeException(ex);
        }

        final AccessToken accessToken = authFlow.finish(verifier);
        System.out.println(accessToken.getToken());
        System.out.println(accessToken.getAccessTokenSecret());


        AccessToken accessToken1 = new AccessToken(ACCESS_TOKEN,ACCESS_TOKEN_SECRET);

        filterFeature = OAuth1ClientSupport.builder(consumerCredentials).feature()
                .accessToken(accessToken1).build();


        // create a new Jersey client and register filter feature that will add OAuth signatures and
        // JacksonFeature that will process returned JSON data.
        final Client client = ClientBuilder.newBuilder()
                .register(filterFeature)
                .register(JacksonFeature.class)
                .build();

        // make requests to protected resources
        // (no need to care about the OAuth signatures)
        final Response response = client.target(FRIENDS_TIMELINE_URI).request().get();

        System.out.println(response.toString());
    }
}
