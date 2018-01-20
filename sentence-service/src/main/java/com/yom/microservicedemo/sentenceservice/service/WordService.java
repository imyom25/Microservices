package com.yom.microservicedemo.sentenceservice.service;

import com.yom.microservicedemo.sentenceservice.domain.Word;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Created by yogendra on 16/9/17.
 */

public interface WordService {

    Word getSubject();
    Word getVerb();
    Word getArticle();
    Word getAdjective();
    Word getNoun();
}
