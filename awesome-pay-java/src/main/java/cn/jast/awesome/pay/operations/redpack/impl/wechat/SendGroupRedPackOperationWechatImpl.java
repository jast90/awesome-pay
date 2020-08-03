package cn.jast.awesome.pay.operations.redpack.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.redpack.SendGroupRedPackOperation;
import cn.jast.awesome.pay.operations.redpack.impl.wechat.domain.SendGroupRedPackRequest;
import cn.jast.awesome.pay.operations.redpack.impl.wechat.domain.SendGroupRedPackResponse;
import org.springframework.web.client.RestTemplate;

public class SendGroupRedPackOperationWechatImpl extends BaseOperationWechatImpl implements
        SendGroupRedPackOperation<SendGroupRedPackRequest, SendGroupRedPackResponse> {

    private final String url = "https://api.mch.weixin.qq.com/mmpaymkttransfers/sendgroupredpack";

    public SendGroupRedPackOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public SendGroupRedPackResponse sendGroupRedPack(SendGroupRedPackRequest sendGroupRedPackRequest) {
        return doRequest(sendGroupRedPackRequest,SendGroupRedPackResponse.class);
    }
}
