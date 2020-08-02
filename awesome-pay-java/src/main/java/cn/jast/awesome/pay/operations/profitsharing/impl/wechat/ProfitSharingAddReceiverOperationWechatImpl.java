package cn.jast.awesome.pay.operations.profitsharing.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.profitsharing.ProfitSharingAddReceiverOperation;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingAddReceiverRequestParam;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingAddReceiverResponse;
import org.springframework.web.client.RestTemplate;

public class ProfitSharingAddReceiverOperationWechatImpl extends BaseOperationWechatImpl implements ProfitSharingAddReceiverOperation<ProfitSharingAddReceiverRequestParam,
        ProfitSharingAddReceiverResponse> {

    private final String url = "https://api.mch.weixin.qq.com/pay/profitsharingaddreceiver";

    public ProfitSharingAddReceiverOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public ProfitSharingAddReceiverResponse addReceive(ProfitSharingAddReceiverRequestParam receiverRequestParam) {
        return doRequest(receiverRequestParam,ProfitSharingAddReceiverResponse.class);
    }
}
