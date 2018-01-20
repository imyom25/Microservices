package com.yom.microservicedemo.sentenceservice.dao;

import com.yom.microservicedemo.sentenceservice.domain.Word;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by yogendra on 10/9/17.
 */

    @FeignClient("SUBJECT")
    public interface SubjectClient {

        @GetMapping("/")
        public Word getWord();

    }