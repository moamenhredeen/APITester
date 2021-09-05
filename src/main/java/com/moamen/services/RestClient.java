package com.moamen.services;

import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;

public class RestClient {
    private OkHttpClient client = new OkHttpClient();
    public String getRequest(final String url) throws IOException {
        var req = new Request.Builder().url(url).build();
        var res = client.newCall(req).execute();
        return res.body().string();
    }
}
