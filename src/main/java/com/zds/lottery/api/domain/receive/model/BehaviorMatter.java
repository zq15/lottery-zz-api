package com.zds.lottery.api.domain.receive.model;

import lombok.Data;

import java.util.Date;

/**
 * 消息类型
 */
@Data
public class BehaviorMatter {

    private String openId;
    private String fromUserName;
    private String fromToUserName;
    private String msgType;
    private String content;
    private String event;
    private Date createTime;
}
