package com.chat.pushnotification.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliverMessageRequest {
    private String from;
    private String to;
    private String content;
    private long timestamp;
}
