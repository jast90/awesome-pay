package io.github.jast90.pay.operations.profitsharing.impl.wechat;

import io.github.jast90.pay.domain.wechat.BaseOperationWechatImpl;
import io.github.jast90.pay.operations.WechatOperation;
import io.github.jast90.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingRequestParam;
import io.github.jast90.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingResponse;
import io.github.jast90.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;


public class ProfitSharingOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<ProfitSharingRequestParam,ProfitSharingResponse> {

    private final String url="https://api.mch.weixin.qq.com/secapi/pay/profitsharing";

    public ProfitSharingOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    /**
     * 单次分账请求按照传入的分账接收方账号和资金进行分账，同时会将订单剩余的待分账金额解冻给本商户。故操作成功后，订单不能再进行分账，也不能进行分账完结。
     * @param profitSharingRequestParam
     * @return
     */
    @Override
    public ProfitSharingResponse operation(ProfitSharingRequestParam profitSharingRequestParam,String key) {
        return doRequest(profitSharingRequestParam,ProfitSharingRequestParam.class,ProfitSharingResponse.class,
                WechatPayUtil.SignType.MD5,key
                );
    }
}
