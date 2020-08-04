package cn.jast.awesome.pay.operations.order.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.WechatOperation;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderRefundQueryRequestParam;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderRefundQueryResponse;
import cn.jast.awesome.pay.util.ClassToXml;
import cn.jast.awesome.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class OrderRefundQueryOperationWechatImpl extends BaseOperationWechatImpl
        implements WechatOperation<WechatOrderRefundQueryRequestParam, WechatOrderRefundQueryResponse> {

    private  final String url = "https://api.mch.weixin.qq.com/pay/refundquery";

    public OrderRefundQueryOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public WechatOrderRefundQueryResponse operation(WechatOrderRefundQueryRequestParam wechatOrderRefundQueryRequestParam,
                                                    String key) {
        return doRequestISO88591(wechatOrderRefundQueryRequestParam,WechatOrderRefundQueryRequestParam.class,
                WechatOrderRefundQueryResponse.class,WechatPayUtil.SignType.MD5,key);
    }
}
