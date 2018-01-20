package com.yom.microservicedemo.sentenceservice.dao;

import com.yom.microservicedemo.sentenceservice.domain.Word;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("NOUN")
public interface NounClient {

    @GetMapping("/")
    public Word getWord();

}
