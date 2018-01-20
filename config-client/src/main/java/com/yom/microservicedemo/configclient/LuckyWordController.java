package com.yom.microservicedemo.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yogendra on 31/8/17.
 */
@RestController
@ConfigurationProperties(prefix = "wordConfig")
public class LuckyWordController {

    public String getLuckyWord() {
        return luckyWord;
    }

    public void setLuckyWord(String luckyWord) {
        this.luckyWord = luckyWord;
    }

    public String getPreamble() {
        return preamble;
    }

    public void setPreamble(String preamble) {
        this.preamble = preamble;
    }

    String luckyWord;
    String preamble;

    @GetMapping("/lucky-word")
    public String showLuckyWord() {
        return preamble + ": " + luckyWord;
    }


}
