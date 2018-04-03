package com.jersay.twitterAPI;

import com.github.scribejava.apis.TwitterApi;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.builder.api.DefaultApi20;
import com.github.scribejava.core.model.*;
import com.github.scribejava.core.oauth.OAuth10aService;
import com.github.scribejava.core.oauth.OAuth20Service;
import com.jersay.twitterAPI.api.TweetsApi;
import com.jersay.twitterAPI.payloads.tweets.HomeTimeLine;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

import static com.jersay.twitterAPI.constants.TwitterAPIConsts.FRIENDS_TIMELINE_URI;
import static com.jersay.twitterAPI.constants.TwitterAPIConsts.VERIFY_CREDENTIALS;


public class JerseyClientLiveTest {
    private static final String COSUMER_KEY = "QK6tJzbhiYgqq9C2eRI8UuIvz";
    private static final String COSUMER_SEKRET_KEY = "gZfMQ8dHr9e8xCidS92NaFFSlRWelurLBNnh03HKN7i2bKJEde";
    private static final String ACCESS_TOKEN = "971038894115475457-6kSyriaT8V4m4NKdoudgYaFXoRuic2h";
    private static final String ACCESS_TOKEN_SECRET = "0EQcJyjOjAbaUa8m9r4lNuWtgiYMlPvqDRwEUUw9d6yhe";
    private TweetsApi client = new TweetsApi();

//    public static void main(String[] args) throws InterruptedException, ExecutionException, IOException {
//        final OAuth10aService  service = new ServiceBuilder(COSUMER_KEY)
//                .apiSecret(COSUMER_SEKRET_KEY)
//                .build(TwitterApi.instance());
//
//        final OAuthRequest request = new OAuthRequest(Verb.GET, VERIFY_CREDENTIALS);
//        OAuth1AccessToken auth2AccessToken = new OAuth1AccessToken(ACCESS_TOKEN,ACCESS_TOKEN_SECRET);
//        service.signRequest(auth2AccessToken,request);
//
//        final Response response = service.execute(request);
//        System.out.println(response.getBody());


    @Test
    public void testHomeTimeLine() {
        List<HomeTimeLine> timeLines = new TweetsApi().getHomeTimeLineResponse();
        System.out.println("Tweets:\n");
        for (final HomeTimeLine s : timeLines) {
            System.out.println(s.getUser().getId());
        }
    }
}
