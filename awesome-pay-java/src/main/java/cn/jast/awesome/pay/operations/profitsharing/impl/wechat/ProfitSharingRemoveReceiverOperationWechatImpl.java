package cn.jast.awesome.pay.operations.profitsharing.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.profitsharing.ProfitSharingRemoveReceiverOperation;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingRemoveReceiverRequestParam;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingRemoveReceiverResponse;
import org.springframework.web.client.RestTemplate;

public class ProfitSharingRemoveReceiverOperationWechatImpl extends BaseOperationWechatImpl implements ProfitSharingRemoveReceiverOperation<ProfitSharingRemoveReceiverRequestParam,
        ProfitSharingRemoveReceiverResponse> {

    private final String url="https://api.mch.weixin.qq.com/pay/profitsharingremovereceiver";

    public ProfitSharingRemoveReceiverOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public ProfitSharingRemoveReceiverResponse removeReceiver(ProfitSharingRemoveReceiverRequestParam profitSharingRemoveReceiverRequestParam) {
        return doRequest(profitSharingRemoveReceiverRequestParam,ProfitSharingRemoveReceiverResponse.class);
    }
}
