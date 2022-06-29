package com.oEmbed.test.service.providers;


public class Twitter implements Provider{
    private final String URL;

    public Twitter(String URL) {
        this.URL = URL;
    }

    @Override
    public String getProvideUrl() {
        return this.URL;
    }
}
