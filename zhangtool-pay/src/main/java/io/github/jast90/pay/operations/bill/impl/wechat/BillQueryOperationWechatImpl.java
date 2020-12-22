package io.github.jast90.pay.operations.bill.impl.wechat;

import io.github.jast90.pay.domain.wechat.BaseOperationWechatImpl;
import io.github.jast90.pay.operations.WechatOperation;
import io.github.jast90.pay.operations.bill.impl.wechat.domain.WechatBillQueryRequestParam;
import io.github.jast90.pay.operations.bill.impl.wechat.domain.WechatBillQueryResponse;
import io.github.jast90.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class BillQueryOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<WechatBillQueryRequestParam, WechatBillQueryResponse> {

    private final String url = "https://api.mch.weixin.qq.com/pay/downloadbill";

    public BillQueryOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public WechatBillQueryResponse operation(WechatBillQueryRequestParam wechatBillQueryRequestParam,String key) {
        return doRequestISO88591(wechatBillQueryRequestParam,WechatBillQueryRequestParam.class,
                WechatBillQueryResponse.class, WechatPayUtil.SignType.MD5,key);
    }
}
