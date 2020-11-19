package com.example.testeventpublisher.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyEventPublisher implements ApplicationEventPublisherAware {
    public ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void publishGainLogisticsNoEvent(String subOrderNo) {
        try {
            GainLogisticsNoEvent event = new GainLogisticsNoEvent(subOrderNo);
            publisher.publishEvent(event);
        } catch (Exception e) {
           log.error(this.getClass().getName(), e, "发布获得物流单号事件异常");
        }
    }


}

