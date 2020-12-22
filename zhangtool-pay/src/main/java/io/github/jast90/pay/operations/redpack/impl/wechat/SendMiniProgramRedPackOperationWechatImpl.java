package io.github.jast90.pay.operations.redpack.impl.wechat;

import io.github.jast90.pay.domain.wechat.BaseOperationWechatImpl;
import io.github.jast90.pay.operations.WechatOperation;
import io.github.jast90.pay.operations.redpack.impl.wechat.domain.SendMiniProgramRedPackRequest;
import io.github.jast90.pay.operations.redpack.impl.wechat.domain.SendMiniProgramRedPackResponse;
import io.github.jast90.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class SendMiniProgramRedPackOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<SendMiniProgramRedPackRequest, SendMiniProgramRedPackResponse> {

    private final String url = "https://api.mch.weixin.qq.com/mmpaymkttransfers/sendminiprogramhb";

    public SendMiniProgramRedPackOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public SendMiniProgramRedPackResponse operation(SendMiniProgramRedPackRequest sendMiniProgramRedPackRequest,String key) {
        return doRequest(sendMiniProgramRedPackRequest,SendMiniProgramRedPackRequest.class,SendMiniProgramRedPackResponse.class,
                WechatPayUtil.SignType.MD5,key
                );
    }
}
