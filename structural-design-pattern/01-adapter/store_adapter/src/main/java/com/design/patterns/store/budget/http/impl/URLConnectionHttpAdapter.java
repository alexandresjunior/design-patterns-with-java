package com.design.patterns.store.budget.http.impl;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import com.design.patterns.store.budget.http.HttpAdapter;

public class URLConnectionHttpAdapter implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> data) {
        try {
            URL urlApiUrl = new URL(url);

            URLConnection connection = urlApiUrl.openConnection();

            connection.connect();

            // And the remaining implementation...
        } catch (Exception e) {
            throw new RuntimeException("Error in API Request", e);
        }
    }
    
}
