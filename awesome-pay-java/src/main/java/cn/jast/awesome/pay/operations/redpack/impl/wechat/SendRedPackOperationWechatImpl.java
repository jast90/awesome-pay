package cn.jast.awesome.pay.operations.redpack.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.WechatOperation;
import cn.jast.awesome.pay.operations.redpack.impl.wechat.domain.SendRedPackRequest;
import cn.jast.awesome.pay.operations.redpack.impl.wechat.domain.SendRedPackResponse;
import cn.jast.awesome.pay.util.WechatPayUtil;
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
