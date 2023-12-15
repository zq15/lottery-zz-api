package com.zds.lottery.api.domain.receive.service.logic.impl;

import com.alibaba.fastjson.JSON;
import com.zds.lottery.api.domain.receive.model.BehaviorMatter;
import com.zds.lottery.api.domain.receive.service.logic.LogicFilter;
import com.zds.lottery.rpc.activity.ILotteryActivityBooth;
import com.zds.lottery.rpc.activity.dto.AwardDTO;
import com.zds.lottery.rpc.activity.req.DrawReq;
import com.zds.lottery.rpc.activity.res.DrawRes;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 抽奖服务
 */
@Service
@Slf4j
public class LotteryLogicFilter implements LogicFilter {

    @DubboReference(interfaceClass = ILotteryActivityBooth.class, url = "dubbo://127.0.0.1:20880")
    private ILotteryActivityBooth lotteryActivityBooth;

    @Override
    public String filter(BehaviorMatter request) {
        DrawReq drawReq = new DrawReq();
        drawReq.setUId(request.getOpenId().substring(1, 11));
        drawReq.setActivityId(100001L);
        drawReq.setPartakeTime(new Date());

        log.info("远程接口调用: {}", JSON.toJSONString(drawReq));
        DrawRes drawRes = lotteryActivityBooth.doDraw(drawReq);
        AwardDTO awardDTO = drawRes.getAwardDTO();

        if (!"0000".equals(drawRes.getCode())) {
            return "抽奖💐 提示：" + drawRes.getInfo();
        }

        return "恭喜💐 您已中奖：" + awardDTO.getAwardName() + " - Lottery 抽奖系统，" + awardDTO.getAwardContent();
    }
}
