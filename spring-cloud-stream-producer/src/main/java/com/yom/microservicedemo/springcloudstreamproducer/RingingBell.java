package com.yom.microservicedemo.springcloudstreamproducer;


import com.yom.microservicedemo.springcloudstreamproducer.DoorSystem;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(DoorSystem.class)
public class RingingBell {

    @Bean
    @InboundChannelAdapter(channel = "door", poller = @Poller(fixedDelay = "2000"))
    public MessageSource<Greeting> ringTheBell(){


        return ()-> MessageBuilder.withPayload(new Greeting("Koi hai?")).build();//;
    }

    class Greeting{

        public String message;

        public Greeting(String message) {
            this.message = message;
        }
    }
}
