package cn.jast.awesome.pay.operations.order.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.WechatOperation;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderRequestParam;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderResponse;
import cn.jast.awesome.pay.util.ClassToXml;
import cn.jast.awesome.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;

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
