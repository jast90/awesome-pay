package cn.jast.awesome.pay.operations.profitsharing.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.WechatOperation;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingRemoveReceiverRequestParam;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingRemoveReceiverResponse;
import cn.jast.awesome.pay.util.WechatPayUtil;
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
