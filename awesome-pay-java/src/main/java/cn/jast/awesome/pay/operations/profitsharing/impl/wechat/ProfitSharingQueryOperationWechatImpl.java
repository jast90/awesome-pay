package cn.jast.awesome.pay.operations.profitsharing.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.profitsharing.ProfitSharingQueryOperation;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingQueryRequestParam;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingQueryResponse;
import org.springframework.web.client.RestTemplate;

public class ProfitSharingQueryOperationWechatImpl extends BaseOperationWechatImpl implements
        ProfitSharingQueryOperation<ProfitSharingQueryRequestParam, ProfitSharingQueryResponse> {

    private final String url = "https://api.mch.weixin.qq.com/pay/profitsharingquery";

    public ProfitSharingQueryOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }


    @Override
    public ProfitSharingQueryResponse profitSharingQuery(ProfitSharingQueryRequestParam profitSharingQueryRequestParam) {
        ProfitSharingQueryResponse response = doRequest(profitSharingQueryRequestParam,ProfitSharingQueryResponse.class);
        //TODO 解析String 为 Java对象
        return response;
    }
}
