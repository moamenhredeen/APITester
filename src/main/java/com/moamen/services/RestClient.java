package com.moamen.services;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class RestClient{

    // instance variables
    private final HttpClient client;

    // constructors
    public RestClient() {
        this.client = HttpClient.newBuilder()
                .build();
    }

    // main methods
    public String get(HttpRequest req)  {
        HttpResponse<String> res = null;
        try {
            res = client.sendAsync(req, HttpResponse.BodyHandlers.ofString())
                    .get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return res.body();
    }


    // Short hand Methods
    public String get(final String url){
        var req = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .version(HttpClient.Version.HTTP_1_1)
                .build();
        return this.get(req);
    }
}
