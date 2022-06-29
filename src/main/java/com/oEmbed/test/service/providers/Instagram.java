package com.oEmbed.test.service.providers;


public class Instagram implements Provider{
    private final String URL;

    public Instagram(String URL) {
        this.URL = URL;
    }

    @Override
    public String getProvideUrl() {
        return this.URL;
    }
}
