package com.oEmbed.test.service;

import com.oEmbed.test.dto.ResponseDto;
import com.oEmbed.test.service.providers.Provider;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class OEmbedInfo {
    private Provider provider;

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Mono<ResponseDto> getOEmbedInfo(String url) {
        String oEmbedUrl = provider.getProvideUrl() + url;
        WebClient webClient = WebClient.builder().build();
        return webClient.get().uri(oEmbedUrl).retrieve().bodyToMono(ResponseDto.class);
    }
}
