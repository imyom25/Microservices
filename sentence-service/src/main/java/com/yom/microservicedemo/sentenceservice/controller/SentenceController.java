package com.yom.microservicedemo.sentenceservice.controller;

import com.yom.microservicedemo.sentenceservice.service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yogendra on 2/9/17.
 */
@Controller
public class SentenceController {

    @Autowired
    private SentenceService sentenceService;

    @GetMapping("/sentence")
    public @ResponseBody String getSentences() {
        return
                "<h3>Some Sentences</h3><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>" +
                        sentenceService.buildSentence() + "<br/><br/>"
                ;
    }
}
