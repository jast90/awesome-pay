package cn.jast.awesome.pay.operations.profitsharing.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.profitsharing.MultiProfitSharingOperation;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.MultiProfitSharingRequestParam;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.MultiProfitSharingResponse;
import org.springframework.web.client.RestTemplate;

public class MultiProfitSharingOperationWechatImpl extends BaseOperationWechatImpl implements
        MultiProfitSharingOperation<MultiProfitSharingRequestParam, MultiProfitSharingResponse> {
    private final String url = "https://api.mch.weixin.qq.com/secapi/pay/multiprofitsharing";

    public MultiProfitSharingOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public MultiProfitSharingResponse multiProfitSharing(MultiProfitSharingRequestParam multiProfitSharingRequestParam) {
        return doRequest(multiProfitSharingRequestParam,MultiProfitSharingResponse.class);
    }
}
