package com.mkyong.testevent;

import org.springframework.context.ApplicationEvent;

/**
 * Created by zhenggaoqi on 1/21/17.
 */
public class EmailEvent extends ApplicationEvent {

    private static final long serialVersionUID = 1L;

    private String address;
    private String text;

    public EmailEvent(Object source) {
        super(source);
    }

    public EmailEvent(Object source, String address, String text) {
        super(source);
        this.address = address;
        this.text = text;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
