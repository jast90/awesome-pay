package io.github.jast90.pay.operations.order.impl.wechat;

import io.github.jast90.pay.domain.wechat.BaseOperationWechatImpl;
import io.github.jast90.pay.operations.WechatOperation;
import io.github.jast90.pay.operations.order.impl.wechat.domain.WechatOrderRefundQueryRequestParam;
import io.github.jast90.pay.operations.order.impl.wechat.domain.WechatOrderRefundQueryResponse;
import io.github.jast90.pay.util.WechatPayUtil;
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
                WechatOrderRefundQueryResponse.class, WechatPayUtil.SignType.MD5,key);
    }
}
