package cn.jast.awesome.pay.operations.transfer.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.transfer.TransferOperation;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.TransferWechatRequestParam;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.TransferWechatResponse;
import org.springframework.web.client.RestTemplate;

public class TransferOperationWechatImpl extends BaseOperationWechatImpl implements
        TransferOperation<TransferWechatRequestParam, TransferWechatResponse> {
    private final String url = "https://api.mch.weixin.qq.com/mmpaymkttransfers/promotion/transfers";

    public TransferOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public TransferWechatResponse transfer(TransferWechatRequestParam transferWechatRequestParam) {
        return doRequest(transferWechatRequestParam,TransferWechatResponse.class);
    }
}
