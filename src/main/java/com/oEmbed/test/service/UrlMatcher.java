package com.oEmbed.test.service;

import com.oEmbed.test.service.providers.*;
import org.springframework.stereotype.Component;
import org.springframework.util.PatternMatchUtils;

@Component
public class UrlMatcher {

    public Provider matchProvider(String url) {
        if (PatternMatchUtils.simpleMatch("*youtube*", url)) {
            return new Youtube("https://www.youtube.com/oembed?url=");

        } else if (PatternMatchUtils.simpleMatch("*vimeo*", url)) {
            return new Vimeo("https://vimeo.com/api/oembed.json?url=");

        } else if (PatternMatchUtils.simpleMatch("*twitter*", url)) {
            return new Twitter("https://publish.twitter.com/oembed?url=");

        } else if (PatternMatchUtils.simpleMatch("*instagr*", url)) {
            return new Instagram("https://graph.facebook.com/v10.0/instagram_oembed?url=");

        } else {
            throw new IllegalArgumentException("유효하지 않은 URL 형식입니다.");
        }
    }

}
