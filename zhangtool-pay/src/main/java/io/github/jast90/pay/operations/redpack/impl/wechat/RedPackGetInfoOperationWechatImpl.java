package io.github.jast90.pay.operations.redpack.impl.wechat;

import io.github.jast90.pay.domain.wechat.BaseOperationWechatImpl;
import io.github.jast90.pay.operations.WechatOperation;
import io.github.jast90.pay.operations.redpack.impl.wechat.domain.RedPackGetInfoRequest;
import io.github.jast90.pay.operations.redpack.impl.wechat.domain.RedPackGetInfoResponse;
import io.github.jast90.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class RedPackGetInfoOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<RedPackGetInfoRequest, RedPackGetInfoResponse> {

    private final String url = "https://api.mch.weixin.qq.com/mmpaymkttransfers/gethbinfo";

    public RedPackGetInfoOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public RedPackGetInfoResponse operation(RedPackGetInfoRequest redPackGetInfoRequest,String key) {
        return doRequest(redPackGetInfoRequest,RedPackGetInfoRequest.class,RedPackGetInfoResponse.class,
                WechatPayUtil.SignType.MD5,key);
    }
}
