package com.zds.lottery.api.domain.receive.service.engine;

import com.zds.lottery.api.domain.receive.model.BehaviorMatter;

/**
 * 消息引擎接口
 */
public interface Engine {

    /**
     * 过滤器
     * @param request       入参
     * @return              出参
     * @throws Exception    异常
     */
    String process(final BehaviorMatter request) throws Exception;
}
