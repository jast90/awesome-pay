package cn.jast.awesome.pay.operations.profitsharing.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.WechatOperation;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.MultiProfitSharingRequestParam;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.MultiProfitSharingResponse;
import cn.jast.awesome.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class MultiProfitSharingOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<MultiProfitSharingRequestParam, MultiProfitSharingResponse> {
    private final String url = "https://api.mch.weixin.qq.com/secapi/pay/multiprofitsharing";

    public MultiProfitSharingOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public MultiProfitSharingResponse operation(MultiProfitSharingRequestParam multiProfitSharingRequestParam,
                                                         String key) {
        return doRequest(multiProfitSharingRequestParam,MultiProfitSharingRequestParam.class,MultiProfitSharingResponse.class
                , WechatPayUtil.SignType.MD5,key);
    }
}
