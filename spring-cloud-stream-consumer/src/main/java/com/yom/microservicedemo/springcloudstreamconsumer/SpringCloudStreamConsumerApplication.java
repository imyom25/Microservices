package com.yom.microservicedemo.springcloudstreamconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;

@SpringBootApplication
@EnableBinding(DoorSystem.class)
public class SpringCloudStreamConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringCloudStreamConsumerApplication.class, args);
    }

    @StreamListener(value = "door")
    public void log(Greeting ring) {

        System.out.print("someone is rinnging bell" + ring.message);
    }

   static class Greeting{

        public String message;

        public Greeting(String message) {
            this.message = message;
        }
    }
}
