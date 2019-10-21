package com.chat.pushnotification.model;

import lombok.Value;

@Value
public class PushMessage {
    private String from;
    private String to;
    private String content;
    private long timestamp;
}
