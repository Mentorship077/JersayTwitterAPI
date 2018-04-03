package com.jersay.twitterAPI.api;


import com.jersay.twitterAPI.payloads.tweets.HomeTimeLine;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import java.util.List;

import static com.jersay.twitterAPI.constants.TwitterAPIConsts.FRIENDS_TIMELINE_URI;

public class TweetsApi extends AuthBaseApi {

    public List<HomeTimeLine> getHomeTimeLineResponse() {
        Response response = getAuth()
                .target(FRIENDS_TIMELINE_URI)
                .request()
                .get();
        return response.readEntity(new GenericType<List<HomeTimeLine>>() {
        });
    }
}
