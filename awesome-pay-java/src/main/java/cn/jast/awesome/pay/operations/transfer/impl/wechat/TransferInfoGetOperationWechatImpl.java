package cn.jast.awesome.pay.operations.transfer.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.transfer.TransferInfoGetOperation;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.TransferInfoGetRequest;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.TransferInfoGetResponse;
import org.springframework.web.client.RestTemplate;

public class TransferInfoGetOperationWechatImpl extends BaseOperationWechatImpl implements
        TransferInfoGetOperation<TransferInfoGetRequest, TransferInfoGetResponse> {

    private final String url = "https://api.mch.weixin.qq.com/mmpaymkttransfers/gettransferinfo";

    public TransferInfoGetOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public TransferInfoGetResponse getTransferInfo(TransferInfoGetRequest transferInfoGetRequest) {
        return doRequest(transferInfoGetRequest,TransferInfoGetResponse.class);
    }
}
