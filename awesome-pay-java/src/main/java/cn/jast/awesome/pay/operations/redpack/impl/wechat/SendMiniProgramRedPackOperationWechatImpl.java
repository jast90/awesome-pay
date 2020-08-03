package cn.jast.awesome.pay.operations.redpack.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.redpack.SendMiniProgramRedPackOperation;
import cn.jast.awesome.pay.operations.redpack.impl.wechat.domain.SendMiniProgramRedPackRequest;
import cn.jast.awesome.pay.operations.redpack.impl.wechat.domain.SendMiniProgramRedPackResponse;
import org.springframework.web.client.RestTemplate;

public class SendMiniProgramRedPackOperationWechatImpl extends BaseOperationWechatImpl implements
        SendMiniProgramRedPackOperation<SendMiniProgramRedPackRequest, SendMiniProgramRedPackResponse> {

    private final String url = "https://api.mch.weixin.qq.com/mmpaymkttransfers/sendminiprogramhb";

    public SendMiniProgramRedPackOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public SendMiniProgramRedPackResponse sendminiprogramhb(SendMiniProgramRedPackRequest sendMiniProgramRedPackRequest) {
        return doRequest(sendMiniProgramRedPackRequest,SendMiniProgramRedPackResponse.class);
    }
}
