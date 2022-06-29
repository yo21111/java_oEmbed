package com.oEmbed.test.service;

import com.oEmbed.test.dto.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class OEmbedService {
    private final OEmbedInfo oEmbedInfo;
    private final UrlMatcher urlMatcher;

    public ResponseDto getSearchResult(String url) {
        oEmbedInfo.setProvider(urlMatcher.matchProvider(url));
        return this.oEmbedInfo.getOEmbedInfo(url).blockOptional().orElseThrow();
    }

}
