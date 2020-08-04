package cn.jast.awesome.pay.operations.redpack.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.WechatOperation;
import cn.jast.awesome.pay.operations.redpack.impl.wechat.domain.RedPackGetInfoRequest;
import cn.jast.awesome.pay.operations.redpack.impl.wechat.domain.RedPackGetInfoResponse;
import cn.jast.awesome.pay.util.WechatPayUtil;
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
