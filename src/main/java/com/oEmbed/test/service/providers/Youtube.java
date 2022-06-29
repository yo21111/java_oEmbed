package com.oEmbed.test.service.providers;


public class Youtube implements Provider{
    private final String URL;

    public Youtube(String URL) {
        this.URL = URL;
    }

    @Override
    public String getProvideUrl() {
        return this.URL;
    }
}
