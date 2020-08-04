package cn.jast.awesome.pay.operations.profitsharing.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.WechatOperation;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingFinishRequestParam;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingFinishResponse;
import cn.jast.awesome.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class ProfitSharingFinishOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<ProfitSharingFinishRequestParam, ProfitSharingFinishResponse> {
    private final String url = "https://api.mch.weixin.qq.com/secapi/pay/profitsharingfinish";

    public ProfitSharingFinishOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public ProfitSharingFinishResponse operation(ProfitSharingFinishRequestParam profitSharingFinishRequestParam,
                                                 String key) {
        return doRequest(profitSharingFinishRequestParam,ProfitSharingFinishRequestParam.class ,
                ProfitSharingFinishResponse.class,
                WechatPayUtil.SignType.MD5,key
                );
    }
}
