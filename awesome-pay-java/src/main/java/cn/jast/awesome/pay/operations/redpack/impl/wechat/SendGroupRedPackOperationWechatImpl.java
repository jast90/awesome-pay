package cn.jast.awesome.pay.operations.redpack.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.WechatOperation;
import cn.jast.awesome.pay.operations.redpack.impl.wechat.domain.SendGroupRedPackRequest;
import cn.jast.awesome.pay.operations.redpack.impl.wechat.domain.SendGroupRedPackResponse;
import cn.jast.awesome.pay.util.WechatPayUtil;
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
