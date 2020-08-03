package cn.jast.awesome.pay.operations.transfer.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.transfer.PublicKeyGetOperation;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.PublicKeyGetRequest;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.PublicKeyGetResponse;
import org.springframework.web.client.RestTemplate;

public class PublicKeyGetOperationWechatImpl extends BaseOperationWechatImpl
        implements PublicKeyGetOperation<PublicKeyGetRequest, PublicKeyGetResponse> {
    private final String url = "https://fraud.mch.weixin.qq.com/risk/getpublickey";

    public PublicKeyGetOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public PublicKeyGetResponse getPublicKey(PublicKeyGetRequest publicKeyGetRequest) {
        return doRequest(publicKeyGetRequest,PublicKeyGetResponse.class);
    }
}
