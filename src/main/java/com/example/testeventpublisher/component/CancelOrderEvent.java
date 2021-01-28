package com.example.testeventpublisher.component;

import org.springframework.context.ApplicationEvent;

/**
 * 取消订单事件
 */
public class CancelOrderEvent extends ApplicationEvent {
    public CancelOrderEvent(Object source) {
        super(source);
    }

    /**
     * 拆单编号
     */
    private String subOrderNo;

    /**
     * @return subOrderNo
     */
    public String getSubOrderNo() {
        return subOrderNo;
    }

    /**
     * @param subOrderNo subOrderNo
     */
    public void setSubOrderNo(String subOrderNo) {
        this.subOrderNo = subOrderNo;
    }
}
