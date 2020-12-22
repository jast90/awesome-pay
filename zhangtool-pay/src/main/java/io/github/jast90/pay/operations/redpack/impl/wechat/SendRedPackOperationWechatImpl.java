package io.github.jast90.pay.operations.redpack.impl.wechat;

import io.github.jast90.pay.domain.wechat.BaseOperationWechatImpl;
import io.github.jast90.pay.operations.WechatOperation;
import io.github.jast90.pay.operations.redpack.impl.wechat.domain.SendRedPackRequest;
import io.github.jast90.pay.operations.redpack.impl.wechat.domain.SendRedPackResponse;
import io.github.jast90.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class SendRedPackOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<SendRedPackRequest, SendRedPackResponse> {

    private final String url = "https://api.mch.weixin.qq.com/mmpaymkttransfers/sendredpack";

    public SendRedPackOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public SendRedPackResponse operation(SendRedPackRequest sendRedPackRequest,String key) {
        return doRequest(sendRedPackRequest,SendRedPackRequest.class,SendRedPackResponse.class,
                WechatPayUtil.SignType.MD5,key);
    }
}
