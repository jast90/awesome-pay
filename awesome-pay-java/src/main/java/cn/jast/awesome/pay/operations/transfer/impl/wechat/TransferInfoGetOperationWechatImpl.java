package cn.jast.awesome.pay.operations.transfer.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.WechatOperation;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.TransferInfoGetRequest;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.TransferInfoGetResponse;
import cn.jast.awesome.pay.util.WechatPayUtil;
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
