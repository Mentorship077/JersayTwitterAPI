package com.jersay.twitterAPI;

import com.jersay.twitterAPI.payloads.tweets.HomeTimeLine;
import org.testng.annotations.Test;

import javax.ws.rs.core.Response;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class JerseyClientLiveTest {
    public static final int HTTP_CREATED = 201;
    private RestClient client = new RestClient();


    @Test
    public void givenCorrectObject_whenCorrectJsonRequest_thenResponseCodeCreated() {

        HomeTimeLine response = client.getJsonEmployee(2);
        System.out.println(response.toString());

    }
}
