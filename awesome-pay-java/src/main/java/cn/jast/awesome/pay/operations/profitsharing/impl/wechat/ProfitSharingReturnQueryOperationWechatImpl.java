package cn.jast.awesome.pay.operations.profitsharing.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.profitsharing.ProfitSharingReturnQueryOperation;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingReturnQueryRequestParam;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingReturnQueryResponse;
import org.springframework.web.client.RestTemplate;

public class ProfitSharingReturnQueryOperationWechatImpl extends BaseOperationWechatImpl implements
        ProfitSharingReturnQueryOperation<ProfitSharingReturnQueryRequestParam, ProfitSharingReturnQueryResponse> {

    private final String url = "https://api.mch.weixin.qq.com/pay/profitsharingreturnquery";

    public ProfitSharingReturnQueryOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public ProfitSharingReturnQueryResponse profitSharingReturnQuery(ProfitSharingReturnQueryRequestParam profitSharingReturnQueryRequestParam) {
        return doRequest(profitSharingReturnQueryRequestParam,ProfitSharingReturnQueryResponse.class);
    }
}
