package io.github.jast90.pay.operations.transfer.impl.wechat;

import io.github.jast90.pay.domain.wechat.BaseOperationWechatImpl;
import io.github.jast90.pay.operations.WechatOperation;
import io.github.jast90.pay.operations.transfer.impl.wechat.domain.TransferInfoGetRequest;
import io.github.jast90.pay.operations.transfer.impl.wechat.domain.TransferInfoGetResponse;
import io.github.jast90.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class TransferInfoGetOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<TransferInfoGetRequest, TransferInfoGetResponse> {

    private final String url = "https://api.mch.weixin.qq.com/mmpaymkttransfers/gettransferinfo";

    public TransferInfoGetOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public TransferInfoGetResponse operation(TransferInfoGetRequest transferInfoGetRequest,String key) {
        return doRequest(transferInfoGetRequest,TransferInfoGetRequest.class,TransferInfoGetResponse.class,
                WechatPayUtil.SignType.MD5,key);
    }
}
