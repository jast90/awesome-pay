package cn.jast.awesome.pay.operations.transfer.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.WechatOperation;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.PublicKeyGetRequest;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.PublicKeyGetResponse;
import cn.jast.awesome.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class PublicKeyGetOperationWechatImpl extends BaseOperationWechatImpl
        implements WechatOperation<PublicKeyGetRequest, PublicKeyGetResponse> {
    private final String url = "https://fraud.mch.weixin.qq.com/risk/getpublickey";

    public PublicKeyGetOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public PublicKeyGetResponse operation(PublicKeyGetRequest publicKeyGetRequest,String key) {
        return doRequest(publicKeyGetRequest,PublicKeyGetRequest.class,PublicKeyGetResponse.class,
                WechatPayUtil.SignType.MD5,key
                );
    }
}
