package cn.jast.awesome.pay.operations.redpack.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.redpack.SendRedpackOperation;
import cn.jast.awesome.pay.operations.redpack.impl.wechat.domain.SendRedPackRequest;
import cn.jast.awesome.pay.operations.redpack.impl.wechat.domain.SendRedPackResponse;
import org.springframework.web.client.RestTemplate;

public class SendRedPackOperationWechatImpl extends BaseOperationWechatImpl implements
        SendRedpackOperation<SendRedPackRequest, SendRedPackResponse> {

    private final String url = "https://api.mch.weixin.qq.com/mmpaymkttransfers/sendredpack";

    public SendRedPackOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public SendRedPackResponse sendRedPack(SendRedPackRequest sendRedPackRequest) {
        return doRequest(sendRedPackRequest,SendRedPackResponse.class);
    }
}
