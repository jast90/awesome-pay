package io.github.jast90.pay.operations.order.impl.wechat;

import io.github.jast90.pay.domain.wechat.BaseOperationWechatImpl;
import io.github.jast90.pay.operations.WechatOperation;
import io.github.jast90.pay.operations.order.impl.wechat.domain.WechatOrderRefundRequestParam;
import io.github.jast90.pay.operations.order.impl.wechat.domain.WechatOrderRefundResponse;
import io.github.jast90.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;


public class OrderRefundOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<WechatOrderRefundRequestParam, WechatOrderRefundResponse> {

    private final String url = "https://api.mch.weixin.qq.com/secapi/pay/refund";

    public OrderRefundOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }


    @Override
    public WechatOrderRefundResponse operation(WechatOrderRefundRequestParam wechatOrderRefundRequestParam,String key) {
        return doRequestISO88591(wechatOrderRefundRequestParam,WechatOrderRefundRequestParam.class,
                WechatOrderRefundResponse.class, WechatPayUtil.SignType.MD5,key);
    }
}
