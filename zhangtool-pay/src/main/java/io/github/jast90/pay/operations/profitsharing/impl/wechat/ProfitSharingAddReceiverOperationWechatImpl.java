package io.github.jast90.pay.operations.profitsharing.impl.wechat;

import io.github.jast90.pay.domain.wechat.BaseOperationWechatImpl;
import io.github.jast90.pay.operations.WechatOperation;
import io.github.jast90.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingAddReceiverRequestParam;
import io.github.jast90.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingAddReceiverResponse;
import io.github.jast90.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class ProfitSharingAddReceiverOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<ProfitSharingAddReceiverRequestParam,ProfitSharingAddReceiverResponse> {

    private final String url = "https://api.mch.weixin.qq.com/pay/profitsharingaddreceiver";

    public ProfitSharingAddReceiverOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public ProfitSharingAddReceiverResponse operation(ProfitSharingAddReceiverRequestParam receiverRequestParam,
                                                      String key) {
        return doRequest(receiverRequestParam,ProfitSharingAddReceiverRequestParam.class,
                ProfitSharingAddReceiverResponse.class, WechatPayUtil.SignType.MD5,key
                );
    }
}
