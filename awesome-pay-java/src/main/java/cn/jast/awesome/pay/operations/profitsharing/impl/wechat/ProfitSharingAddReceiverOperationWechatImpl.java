package cn.jast.awesome.pay.operations.profitsharing.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.WechatOperation;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingAddReceiverRequestParam;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingAddReceiverResponse;
import cn.jast.awesome.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class ProfitSharingAddReceiverOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<ProfitSharingAddReceiverRequestParam,ProfitSharingAddReceiverResponse> {

    private final String url = "https://api.mch.weixin.qq.com/pay/profitsharingaddreceiver";

    public ProfitSharingAddReceiverOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public ProfitSharingAddReceiverResponse operation(ProfitSharingAddReceiverRequestParam receiverRequestParam,
                                                      String key) {
        return doRequest(receiverRequestParam,ProfitSharingAddReceiverRequestParam.class,
                ProfitSharingAddReceiverResponse.class, WechatPayUtil.SignType.MD5,key
                );
    }
}
