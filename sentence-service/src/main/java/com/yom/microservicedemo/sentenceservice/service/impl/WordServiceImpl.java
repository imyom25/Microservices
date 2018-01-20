package com.yom.microservicedemo.sentenceservice.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yom.microservicedemo.sentenceservice.dao.*;
import com.yom.microservicedemo.sentenceservice.domain.Word;
import com.yom.microservicedemo.sentenceservice.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yogendra on 16/9/17.
 */
@Service
public class WordServiceImpl implements WordService {

    @Autowired
    public WordServiceImpl(VerbClient verbService, SubjectClient subjectService, ArticleClient articleService, AdjectiveClient adjectiveService, NounClient nounClient) {
        this.verbService = verbService;
        this.subjectService = subjectService;
        this.articleService = articleService;
        this.adjectiveService = adjectiveService;
        this.nounClient = nounClient;
    }

    private VerbClient verbService;
    @Override
    //@HystrixCommand(fallbackMethod = "getFallbackSubject")
    public Word getSubject() {
        return subjectService.getWord();
    }
    private SubjectClient subjectService;
    private ArticleClient articleService;
    private AdjectiveClient adjectiveService;
    private NounClient nounClient;

    @Override
    //@HystrixCommand(fallbackMethod = "getFallbackSubject")
    public Word getVerb() {
        return verbService.getWord();
    }

    @Override
    //@HystrixCommand(fallbackMethod = "getFallbackSubject")
    public Word getArticle() {
        return articleService.getWord();
    }

    @Override
    @HystrixCommand(fallbackMethod="getFallbackAdjective")
    public Word getAdjective() {
        return adjectiveService.getWord();
    }

    @Override
    @HystrixCommand(fallbackMethod="getFallbackNoun")
    public Word getNoun() {
        return nounClient.getWord();
    }

    public Word getFallbackAdjective() {
        return new Word("MUMBAI");
    }

    public Word getFallbackNoun() {
        return new Word("RMK");
    }

}
