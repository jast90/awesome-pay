package cn.jast.awesome.pay.operations.transfer.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.WechatOperation;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.TransferWechatRequestParam;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.TransferWechatResponse;
import cn.jast.awesome.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class TransferOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<TransferWechatRequestParam, TransferWechatResponse> {
    private final String url = "https://api.mch.weixin.qq.com/mmpaymkttransfers/promotion/transfers";

    public TransferOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public TransferWechatResponse operation(TransferWechatRequestParam transferWechatRequestParam,String key) {
        return doRequest(transferWechatRequestParam,TransferWechatRequestParam.class,TransferWechatResponse.class,
                WechatPayUtil.SignType.MD5,key);
    }
}
