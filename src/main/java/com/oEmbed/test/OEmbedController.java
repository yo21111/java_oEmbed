package com.oEmbed.test;

import com.oEmbed.test.dto.ResponseDto;
import com.oEmbed.test.service.OEmbedService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class OEmbedController {
    private final OEmbedService service;

    @GetMapping("/oEmbed")
    public ResponseDto getSearchResult(@RequestParam String url) {
        return service.getSearchResult(url);
    }
}
