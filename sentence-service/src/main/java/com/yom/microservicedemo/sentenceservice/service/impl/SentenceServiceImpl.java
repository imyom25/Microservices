package com.yom.microservicedemo.sentenceservice.service.impl;

import com.yom.microservicedemo.sentenceservice.dao.*;
import com.yom.microservicedemo.sentenceservice.service.SentenceService;
import com.yom.microservicedemo.sentenceservice.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yogendra on 10/9/17.
 */
@Service
public class SentenceServiceImpl implements SentenceService {

    @Autowired
    WordService wordService;


    /**
     * Assemble a sentence by gathering random words of each part of speech:
     */
    public String buildSentence() {
        //String sentence = "There was a problem assembling the sentence!";
        String sentence =
                String.format("%s %s %s %s %s.",
                        wordService.getSubject().getString(),
                        wordService.getVerb().getString(),
                        wordService.getArticle().getString(),
                        wordService.getAdjective().getString(),
                        wordService.getNoun().getString() );
        return sentence;
    }



}

