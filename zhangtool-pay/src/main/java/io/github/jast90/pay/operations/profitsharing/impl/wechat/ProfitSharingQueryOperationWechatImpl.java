package io.github.jast90.pay.operations.profitsharing.impl.wechat;

import io.github.jast90.pay.domain.wechat.BaseOperationWechatImpl;
import io.github.jast90.pay.operations.WechatOperation;
import io.github.jast90.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingQueryRequestParam;
import io.github.jast90.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingQueryResponse;
import io.github.jast90.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class ProfitSharingQueryOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<ProfitSharingQueryRequestParam, ProfitSharingQueryResponse> {

    private final String url = "https://api.mch.weixin.qq.com/pay/profitsharingquery";

    public ProfitSharingQueryOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }


    @Override
    public ProfitSharingQueryResponse operation(ProfitSharingQueryRequestParam profitSharingQueryRequestParam,String key) {
        ProfitSharingQueryResponse response = doRequest(profitSharingQueryRequestParam,ProfitSharingQueryRequestParam.class,
                ProfitSharingQueryResponse.class, WechatPayUtil.SignType.MD5,key);
        //TODO 解析String 为 Java对象
        return response;
    }
}
