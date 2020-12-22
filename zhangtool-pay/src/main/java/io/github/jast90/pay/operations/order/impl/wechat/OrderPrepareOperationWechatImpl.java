package io.github.jast90.pay.operations.order.impl.wechat;

import io.github.jast90.pay.domain.wechat.BaseOperationWechatImpl;
import io.github.jast90.pay.operations.WechatOperation;
import io.github.jast90.pay.operations.order.impl.wechat.domain.WechatOrderRequestParam;
import io.github.jast90.pay.operations.order.impl.wechat.domain.WechatOrderResponse;
import io.github.jast90.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class OrderPrepareOperationWechatImpl extends BaseOperationWechatImpl
        implements WechatOperation<WechatOrderRequestParam, WechatOrderResponse> {
    private final String url = "https://api.mch.weixin.qq.com/pay/unifiedorder";

    private RestTemplate restTemplate;

    public OrderPrepareOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }


    @Override
    public WechatOrderResponse operation(WechatOrderRequestParam wechatOrderRequestParam,String key) {
        return doRequest(wechatOrderRequestParam,WechatOrderRequestParam.class,WechatOrderResponse.class,
                WechatPayUtil.SignType.MD5,key);
    }
}
