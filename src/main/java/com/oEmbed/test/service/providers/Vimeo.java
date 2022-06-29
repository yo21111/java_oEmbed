package com.oEmbed.test.service.providers;


public class Vimeo implements Provider{
    private final String URL;

    public Vimeo(String URL) {
        this.URL = URL;
    }

    @Override
    public String getProvideUrl() {
        return this.URL;
    }
}
