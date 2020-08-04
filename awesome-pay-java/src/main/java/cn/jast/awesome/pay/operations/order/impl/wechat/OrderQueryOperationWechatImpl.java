package cn.jast.awesome.pay.operations.order.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.WechatOperation;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderQueryRequestParam;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderQueryResponse;
import cn.jast.awesome.pay.util.ClassToXml;
import cn.jast.awesome.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class OrderQueryOperationWechatImpl extends BaseOperationWechatImpl
        implements WechatOperation<WechatOrderQueryRequestParam, WechatOrderQueryResponse> {
    private final String url = "https://api.mch.weixin.qq.com/pay/orderquery";

    public OrderQueryOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public WechatOrderQueryResponse operation(WechatOrderQueryRequestParam wechatOrderQueryRequestParam,String key) {
        return doRequestISO88591(wechatOrderQueryRequestParam,WechatOrderQueryRequestParam.class,WechatOrderQueryResponse.class,
                WechatPayUtil.SignType.MD5,key);
    }
}
