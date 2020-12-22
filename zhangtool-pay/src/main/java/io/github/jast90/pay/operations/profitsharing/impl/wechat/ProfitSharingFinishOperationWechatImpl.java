package io.github.jast90.pay.operations.profitsharing.impl.wechat;

import io.github.jast90.pay.domain.wechat.BaseOperationWechatImpl;
import io.github.jast90.pay.operations.WechatOperation;
import io.github.jast90.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingFinishRequestParam;
import io.github.jast90.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingFinishResponse;
import io.github.jast90.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class ProfitSharingFinishOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<ProfitSharingFinishRequestParam, ProfitSharingFinishResponse> {
    private final String url = "https://api.mch.weixin.qq.com/secapi/pay/profitsharingfinish";

    public ProfitSharingFinishOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public ProfitSharingFinishResponse operation(ProfitSharingFinishRequestParam profitSharingFinishRequestParam,
                                                 String key) {
        return doRequest(profitSharingFinishRequestParam,ProfitSharingFinishRequestParam.class ,
                ProfitSharingFinishResponse.class,
                WechatPayUtil.SignType.MD5,key
                );
    }
}
