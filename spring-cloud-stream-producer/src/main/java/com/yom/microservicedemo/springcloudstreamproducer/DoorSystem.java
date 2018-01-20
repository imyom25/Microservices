package com.yom.microservicedemo.springcloudstreamproducer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Created by yogendra on 11/10/17.
 */

public interface DoorSystem {

    @Output("door")
    MessageChannel ringTheBell();
}
