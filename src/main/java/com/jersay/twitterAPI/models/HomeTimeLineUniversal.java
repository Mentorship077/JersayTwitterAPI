package com.jersay.twitterAPI.models;

import com.jersay.twitterAPI.payloads.tweets.HomeTimeLine;

import javax.ws.rs.core.Response;
import java.util.List;

public class HomeTimeLineUniversal {

    private List<HomeTimeLine> models;
    private Response response;

    public HomeTimeLineUniversal(List<HomeTimeLine> models, Response response) {
        this.models = models;
        this.response = response;
    }

    @Override
    public String toString() {
        return "HomeTimeLineUniversal{" +
                "models=" + models +
                ", response=" + response +
                '}';
    }

    public List<HomeTimeLine> getModels() {
        return models;
    }

    public void setModels(List<HomeTimeLine> models) {
        this.models = models;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
