package io.github.jast90.pay.operations.profitsharing.impl.wechat;

import io.github.jast90.pay.domain.wechat.BaseOperationWechatImpl;
import io.github.jast90.pay.operations.WechatOperation;
import io.github.jast90.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingReturnQueryRequestParam;
import io.github.jast90.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingReturnQueryResponse;
import io.github.jast90.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class ProfitSharingReturnQueryOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<ProfitSharingReturnQueryRequestParam, ProfitSharingReturnQueryResponse> {

    private final String url = "https://api.mch.weixin.qq.com/pay/profitsharingreturnquery";

    public ProfitSharingReturnQueryOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public ProfitSharingReturnQueryResponse operation(ProfitSharingReturnQueryRequestParam profitSharingReturnQueryRequestParam,
                                                      String key) {
        return doRequest(profitSharingReturnQueryRequestParam,ProfitSharingReturnQueryRequestParam.class,
                ProfitSharingReturnQueryResponse.class, WechatPayUtil.SignType.MD5,key
                );
    }
}
