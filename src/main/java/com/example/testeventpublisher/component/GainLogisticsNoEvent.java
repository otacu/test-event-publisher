package com.example.testeventpublisher.component;

import org.springframework.context.ApplicationEvent;

public class GainLogisticsNoEvent extends ApplicationEvent {
    public GainLogisticsNoEvent(Object source) {
        super(source);
    }

    /**
     * 拆单编号
     */
    private String subOrderNo;

    /**
     * 物流单号
     */
    private String logisticsNo;

    /**
     * 物流公司编码
     */
    private String expressCode;

    /**
     * 订单来源
     */
    private Short orderSource;

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

    /**
     * @return logisticsNo
     */
    public String getLogisticsNo() {
        return logisticsNo;
    }

    /**
     * @param logisticsNo logisticsNo
     */
    public void setLogisticsNo(String logisticsNo) {
        this.logisticsNo = logisticsNo;
    }

    /**
     * @return expressCode
     */
    public String getExpressCode() {
        return expressCode;
    }

    /**
     * @param expressCode expressCode
     */
    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    /**
     * @return orderSource
     */
    public Short getOrderSource() {
        return orderSource;
    }

    /**
     * @param orderSource orderSource
     */
    public void setOrderSource(Short orderSource) {
        this.orderSource = orderSource;
    }
}

