package io.github.jast90.pay.operations.transfer.impl.wechat;

import io.github.jast90.pay.domain.wechat.BaseOperationWechatImpl;
import io.github.jast90.pay.operations.WechatOperation;
import io.github.jast90.pay.operations.transfer.impl.wechat.domain.PayBankRequest;
import io.github.jast90.pay.operations.transfer.impl.wechat.domain.PayBankResponse;
import io.github.jast90.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class PayBankOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<PayBankRequest, PayBankResponse> {
    private final String url = "https://api.mch.weixin.qq.com/mmpaysptrans/pay_bank";

    public PayBankOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }


    @Override
    public PayBankResponse operation(PayBankRequest payBankRequest,String key) {
        return doRequest(payBankRequest,PayBankRequest.class,PayBankResponse.class,
                WechatPayUtil.SignType.MD5,key
                );
    }
}
