package cn.jast.awesome.pay.operations.transfer.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.transfer.PayBankOperation;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.PayBankRequest;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.PayBankResponse;
import org.springframework.web.client.RestTemplate;

public class PayBankOperationWechatImpl extends BaseOperationWechatImpl implements
        PayBankOperation<PayBankRequest, PayBankResponse> {
    private final String url = "https://api.mch.weixin.qq.com/mmpaysptrans/pay_bank";

    public PayBankOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }


    @Override
    public PayBankResponse payBank(PayBankRequest payBankRequest) {
        return doRequest(payBankRequest,PayBankResponse.class);
    }
}
