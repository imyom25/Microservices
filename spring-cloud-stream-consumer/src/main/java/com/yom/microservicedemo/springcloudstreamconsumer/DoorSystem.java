package com.yom.microservicedemo.springcloudstreamconsumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by yogendra on 11/10/17.
 */

public interface DoorSystem {

    @Input("door")
    SubscribableChannel ringTheBell();
}
