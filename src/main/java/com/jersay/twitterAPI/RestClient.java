package com.jersay.twitterAPI;

import com.jersay.twitterAPI.payloads.tweets.HomeTimeLine;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RestClient {
    public static final String USERNAME = "papai9919@gmail.com";
    public static final String PASSWORD = "D'Q`^J+ZX3znHD!k";
    private static final String REST_URI = "https://api.twitter.com/1.1/statuses/home_timeline.json";
    private Client client = ClientBuilder.newClient(getAuth(USERNAME, PASSWORD));

    private ClientConfig getAuth(String username, String password) {
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basicBuilder()
                .nonPreemptive()
                .credentials(username, password)
                .build();

        ClientConfig clientConfig = new ClientConfig();
        clientConfig.register(feature);

        return clientConfig;
    }

    public HomeTimeLine getJsonEmployee(int id) {
        return client
                .target(REST_URI)
                .path(String.valueOf(id))
                .request(MediaType.APPLICATION_JSON)
                .get(HomeTimeLine.class);
    }

    public Response createJsonEmployee(HomeTimeLine homeTimeLine) {
        return client
                .target(REST_URI)
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(homeTimeLine, MediaType.APPLICATION_JSON));
    }
}
