package cn.jast.awesome.pay.operations.redpack.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.redpack.RedPackGetInfoOperation;
import cn.jast.awesome.pay.operations.redpack.impl.wechat.domain.RedPackGetInfoRequest;
import cn.jast.awesome.pay.operations.redpack.impl.wechat.domain.RedPackGetInfoResponse;
import org.springframework.web.client.RestTemplate;

public class RedPackGetInfoOperationWechatImpl extends BaseOperationWechatImpl implements
        RedPackGetInfoOperation<RedPackGetInfoRequest, RedPackGetInfoResponse> {

    private final String url = "https://api.mch.weixin.qq.com/mmpaymkttransfers/gethbinfo";

    public RedPackGetInfoOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public RedPackGetInfoResponse gethbinfo(RedPackGetInfoRequest redPackGetInfoRequest) {
        return doRequest(redPackGetInfoRequest,RedPackGetInfoResponse.class);
    }
}
