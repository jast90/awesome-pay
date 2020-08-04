package cn.jast.awesome.pay.operations.profitsharing.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.WechatOperation;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingReturnQueryRequestParam;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingReturnQueryResponse;
import cn.jast.awesome.pay.util.WechatPayUtil;
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
