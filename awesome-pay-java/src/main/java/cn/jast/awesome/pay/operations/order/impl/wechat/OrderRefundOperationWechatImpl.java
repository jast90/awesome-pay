package cn.jast.awesome.pay.operations.order.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.WechatOperation;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderRefundRequestParam;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderRefundResponse;
import cn.jast.awesome.pay.util.ClassToXml;
import cn.jast.awesome.pay.util.WechatPayUtil;
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
