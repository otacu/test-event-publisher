package com.example.testeventpublisher.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartUpRunner implements CommandLineRunner {

    @Autowired
    MyEventPublisher myEventPublisher;

    @Override
    public void run(String... args) throws Exception {
        myEventPublisher.publishGainLogisticsNoEvent("拆单号1");
        myEventPublisher.publishCancelOrderEvent("拆单号2");
    }
}
