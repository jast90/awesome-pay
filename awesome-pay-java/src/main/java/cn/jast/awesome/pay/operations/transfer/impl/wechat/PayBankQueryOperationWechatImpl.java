package cn.jast.awesome.pay.operations.transfer.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.WechatOperation;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.PayBankQueryRequest;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.PayBankQueryResponse;
import cn.jast.awesome.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class PayBankQueryOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<PayBankQueryRequest, PayBankQueryResponse> {
    private final String url = "https://api.mch.weixin.qq.com/mmpaysptrans/query_bank" ;

    public PayBankQueryOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }


    @Override
    public PayBankQueryResponse operation(PayBankQueryRequest payBankQueryRequest,String key) {
        return doRequest(payBankQueryRequest,PayBankQueryRequest.class,PayBankQueryResponse.class,
                WechatPayUtil.SignType.MD5,key
                );
    }
}
