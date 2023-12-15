package com.zds.lottery.api.domain.receive.service.logic.impl;

import com.zds.lottery.api.domain.receive.model.BehaviorMatter;
import com.zds.lottery.api.domain.receive.service.logic.LogicFilter;
import org.springframework.stereotype.Service;

/**
 * 关注微信公众号
 */
@Service("subscribe")
public class SubscribeFilter implements LogicFilter {

    @Override
    public String filter(BehaviorMatter request) {
        return "感谢关注，快来回复抽奖，参与小傅哥的活动吧！";
    }

}
