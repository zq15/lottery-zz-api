package com.zds.lottery.api.application;

import com.zds.lottery.api.domain.receive.model.BehaviorMatter;

/**
 * 处理接收信息
 */
public interface IWxReceiveService {

    /**
     * 接收信息
     *
     * @param behaviorMatter    入参
     * @return                  出惨
     * @throws Exception        异常
     */
    String doReceive(BehaviorMatter behaviorMatter) throws Exception;
}
