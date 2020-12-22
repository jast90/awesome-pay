package io.github.jast90.pay.operations.redpack.impl.wechat;

import io.github.jast90.pay.domain.wechat.BaseOperationWechatImpl;
import io.github.jast90.pay.operations.WechatOperation;
import io.github.jast90.pay.operations.redpack.impl.wechat.domain.SendGroupRedPackRequest;
import io.github.jast90.pay.operations.redpack.impl.wechat.domain.SendGroupRedPackResponse;
import io.github.jast90.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class SendGroupRedPackOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<SendGroupRedPackRequest, SendGroupRedPackResponse> {

    private final String url = "https://api.mch.weixin.qq.com/mmpaymkttransfers/sendgroupredpack";

    public SendGroupRedPackOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public SendGroupRedPackResponse operation(SendGroupRedPackRequest sendGroupRedPackRequest,String key) {
        return doRequest(sendGroupRedPackRequest,SendGroupRedPackRequest.class,SendGroupRedPackResponse.class,
                WechatPayUtil.SignType.MD5,key);
    }
}
