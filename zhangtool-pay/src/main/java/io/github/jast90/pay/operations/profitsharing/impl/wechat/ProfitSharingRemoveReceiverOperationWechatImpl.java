package io.github.jast90.pay.operations.profitsharing.impl.wechat;

import io.github.jast90.pay.domain.wechat.BaseOperationWechatImpl;
import io.github.jast90.pay.operations.WechatOperation;
import io.github.jast90.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingRemoveReceiverRequestParam;
import io.github.jast90.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingRemoveReceiverResponse;
import io.github.jast90.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class ProfitSharingRemoveReceiverOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<ProfitSharingRemoveReceiverRequestParam,ProfitSharingRemoveReceiverResponse> {

    private final String url="https://api.mch.weixin.qq.com/pay/profitsharingremovereceiver";

    public ProfitSharingRemoveReceiverOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public ProfitSharingRemoveReceiverResponse operation(ProfitSharingRemoveReceiverRequestParam profitSharingRemoveReceiverRequestParam,
                                                         String key) {
        return doRequest(profitSharingRemoveReceiverRequestParam,ProfitSharingRemoveReceiverRequestParam.class,
                ProfitSharingRemoveReceiverResponse.class, WechatPayUtil.SignType.MD5,key);
    }
}
