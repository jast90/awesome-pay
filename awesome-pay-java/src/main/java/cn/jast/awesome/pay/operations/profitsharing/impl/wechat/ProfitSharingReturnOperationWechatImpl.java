package cn.jast.awesome.pay.operations.profitsharing.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.WechatOperation;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingReturnRequestParam;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingReturnResponse;
import cn.jast.awesome.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class ProfitSharingReturnOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<ProfitSharingReturnRequestParam, ProfitSharingReturnResponse> {

    private final String url = "https://api.mch.weixin.qq.com/secapi/pay/profitsharingreturn";

    public ProfitSharingReturnOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }


    @Override
    public ProfitSharingReturnResponse operation(ProfitSharingReturnRequestParam profitSharingReturnRequestParam,
                                                 String key) {
        return doRequest(profitSharingReturnRequestParam,ProfitSharingReturnRequestParam.class,
                ProfitSharingReturnResponse.class, WechatPayUtil.SignType.MD5,key);
    }
}
