package com.zds.lottery.api.domain.receive.service;

import com.zds.lottery.api.application.IWxReceiveService;
import com.zds.lottery.api.domain.receive.model.BehaviorMatter;
import com.zds.lottery.api.domain.receive.service.engine.Engine;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WxReceiveServiceImpl implements IWxReceiveService {
    @Resource(name = "msgEngineHandle")
    private Engine msgEngineHandle;

    @Override
    public String doReceive(BehaviorMatter behaviorMatter) throws Exception {
        return msgEngineHandle.process(behaviorMatter);
    }
}
