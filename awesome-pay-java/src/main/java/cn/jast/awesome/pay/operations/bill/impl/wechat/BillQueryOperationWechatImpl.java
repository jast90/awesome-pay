package cn.jast.awesome.pay.operations.bill.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.WechatOperation;
import cn.jast.awesome.pay.operations.bill.impl.wechat.domain.WechatBillQueryRequestParam;
import cn.jast.awesome.pay.operations.bill.impl.wechat.domain.WechatBillQueryResponse;
import cn.jast.awesome.pay.util.ClassToXml;
import cn.jast.awesome.pay.util.WechatPayUtil;
import org.springframework.web.client.RestTemplate;

public class BillQueryOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<WechatBillQueryRequestParam, WechatBillQueryResponse> {

    private final String url = "https://api.mch.weixin.qq.com/pay/downloadbill";

    public BillQueryOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }

    @Override
    public WechatBillQueryResponse operation(WechatBillQueryRequestParam wechatBillQueryRequestParam,String key) {
        return doRequestISO88591(wechatBillQueryRequestParam,WechatBillQueryRequestParam.class,
                WechatBillQueryResponse.class, WechatPayUtil.SignType.MD5,key);
    }
}
