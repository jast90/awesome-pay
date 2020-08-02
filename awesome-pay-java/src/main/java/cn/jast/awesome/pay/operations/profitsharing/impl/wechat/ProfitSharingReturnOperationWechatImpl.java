package cn.jast.awesome.pay.operations.profitsharing.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.profitsharing.ProfitSharingReturnOperation;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingReturnRequestParam;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingReturnResponse;
import org.springframework.web.client.RestTemplate;

public class ProfitSharingReturnOperationWechatImpl extends BaseOperationWechatImpl implements
        ProfitSharingReturnOperation<ProfitSharingReturnRequestParam, ProfitSharingReturnResponse> {

    private final String url = "https://api.mch.weixin.qq.com/secapi/pay/profitsharingreturn";

    public ProfitSharingReturnOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }


    @Override
    public ProfitSharingReturnResponse profitSharingReturn(ProfitSharingReturnRequestParam profitSharingReturnRequestParam) {
        return doRequest(profitSharingReturnRequestParam,ProfitSharingReturnResponse.class);
    }
}
