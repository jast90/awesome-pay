package cn.jast.awesome.pay.operations.profitsharing.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.profitsharing.ProfitSharingFinishOperation;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingFinishRequestParam;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingFinishResponse;
import org.springframework.web.client.RestTemplate;

public class ProfitSharingFinishOperationWechatImpl extends BaseOperationWechatImpl implements
        ProfitSharingFinishOperation<ProfitSharingFinishRequestParam, ProfitSharingFinishResponse> {
    private final String url = "https://api.mch.weixin.qq.com/secapi/pay/profitsharingfinish";

    public ProfitSharingFinishOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public ProfitSharingFinishResponse profitSharingFinish(ProfitSharingFinishRequestParam profitSharingFinishRequestParam) {
        return doRequest(profitSharingFinishRequestParam,ProfitSharingFinishResponse.class);
    }
}
