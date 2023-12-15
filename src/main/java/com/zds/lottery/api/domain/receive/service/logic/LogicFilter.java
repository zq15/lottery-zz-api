package com.zds.lottery.api.domain.receive.service.logic;

import com.zds.lottery.api.domain.receive.model.BehaviorMatter;

/**
 * 逻辑接口
 */
public interface LogicFilter {

    String filter(BehaviorMatter request);
}
