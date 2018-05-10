package com.jersay.twitterAPI;

import com.jersay.twitterAPI.api.TweetsApi;
import com.jersay.twitterAPI.payloads.tweets.HomeTimeLine;
import org.testng.annotations.Test;

import java.util.List;


public class TweetsTest {
    private static final String COSUMER_KEY = "QK6tJzbhiYgqq9C2eRI8UuIvz";
    private static final String COSUMER_SEKRET_KEY = "gZfMQ8dHr9e8xCidS92NaFFSlRWelurLBNnh03HKN7i2bKJEde";
    private static final String ACCESS_TOKEN = "971038894115475457-6kSyriaT8V4m4NKdoudgYaFXoRuic2h";
    private static final String ACCESS_TOKEN_SECRET = "0EQcJyjOjAbaUa8m9r4lNuWtgiYMlPvqDRwEUUw9d6yhe";
    private TweetsApi client = new TweetsApi();


    @Test
    public void testHomeTimeLine() {
        TweetsApi tweetsApi = new TweetsApi();
        List<HomeTimeLine> timeLines = tweetsApi.getHomeTimeLineResponse().getModels();

        System.out.println("Tweets:\n");
        for (final HomeTimeLine s : timeLines) {
            System.out.println(s.getUser().getId());
        }

        tweetsApi.getHomeTimeLineResponse().getResponse();
    }
}
