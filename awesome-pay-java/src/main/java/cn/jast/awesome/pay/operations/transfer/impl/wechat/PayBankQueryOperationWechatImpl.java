package cn.jast.awesome.pay.operations.transfer.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.transfer.PayBankQueryOperation;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.PayBankQueryRequest;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.PayBankQueryResponse;
import org.springframework.web.client.RestTemplate;

public class PayBankQueryOperationWechatImpl extends BaseOperationWechatImpl implements
        PayBankQueryOperation<PayBankQueryRequest, PayBankQueryResponse> {
    private final String url = "https://api.mch.weixin.qq.com/mmpaysptrans/query_bank" ;

    public PayBankQueryOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }


    @Override
    public PayBankQueryResponse queryBank(PayBankQueryRequest payBankQueryRequest) {
        return doRequest(payBankQueryRequest,PayBankQueryResponse.class);
    }
}
