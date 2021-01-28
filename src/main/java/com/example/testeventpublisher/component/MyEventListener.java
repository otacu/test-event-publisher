package com.example.testeventpublisher.component;

import com.alibaba.fastjson.JSON;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener {

    @Async
    @EventListener
    public void handleGainLogisticsNoEvent(GainLogisticsNoEvent event) {
        System.out.println("处理获取物流单号事件:" + JSON.toJSONString(event));
    }

    @Async
    @EventListener
    public void handleCancelOrderEvent(CancelOrderEvent event) {
        System.out.println("处理取消订单事件:" + JSON.toJSONString(event));
    }

}
