package io.github.jast90.pay.operations.order.impl.wechat;

import io.github.jast90.pay.domain.wechat.BaseOperationWechatImpl;
import io.github.jast90.pay.operations.WechatOperation;
import io.github.jast90.pay.operations.order.impl.wechat.domain.WechatOrderCloseRequestParam;
import io.github.jast90.pay.operations.order.impl.wechat.domain.WechatOrderCloseResponse;
import io.github.jast90.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class OrderCloseOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<WechatOrderCloseRequestParam, WechatOrderCloseResponse> {

    private final String url = "https://api.mch.weixin.qq.com/pay/closeorder";

    public OrderCloseOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }


    @Override
    public WechatOrderCloseResponse operation(WechatOrderCloseRequestParam wechatOrderCloseRequestParam,String key) {
        return doRequestISO88591(wechatOrderCloseRequestParam,WechatOrderCloseRequestParam.class,WechatOrderCloseResponse.class,
                WechatPayUtil.SignType.MD5,key);
    }
}
