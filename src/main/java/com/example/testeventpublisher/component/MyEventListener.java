package com.example.testeventpublisher.component;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener {

    @Async
    @EventListener
    public void syncLogisticsNoToXiaohongshu(GainLogisticsNoEvent event) {
        System.out.println("同步物流信息到小红书:" + event.getSource());
    }

    @Async
    @EventListener
    public void syncLogisticsNoToVip(GainLogisticsNoEvent event) {
        System.out.println("同步物流信息到唯品会:" + event.getSource());
    }

}
