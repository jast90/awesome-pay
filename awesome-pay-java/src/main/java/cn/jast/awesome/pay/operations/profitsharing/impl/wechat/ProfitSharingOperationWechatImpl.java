package cn.jast.awesome.pay.operations.profitsharing.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.profitsharing.ProfitSharingOperation;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingRequestParam;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingResponse;
import org.springframework.web.client.RestTemplate;


public class ProfitSharingOperationWechatImpl extends BaseOperationWechatImpl implements ProfitSharingOperation<ProfitSharingRequestParam,
        ProfitSharingResponse> {

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
    public ProfitSharingResponse profitSharing(ProfitSharingRequestParam profitSharingRequestParam) {
        return doRequest(profitSharingRequestParam,ProfitSharingResponse.class);
    }
}
