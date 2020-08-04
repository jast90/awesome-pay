package cn.jast.awesome.pay.operations.order.impl.wechat;

import cn.jast.awesome.pay.domain.wechat.BaseOperationWechatImpl;
import cn.jast.awesome.pay.operations.WechatOperation;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderRequestParam;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderResponse;
import cn.jast.awesome.pay.util.ClassToXml;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;

public class OrderOperationWechatImpl extends BaseOperationWechatImpl implements
        WechatOperation<WechatOrderRequestParam, WechatOrderResponse> {


    private final String url = "https://api.mch.weixin.qq.com/pay/unifiedorder";

    public OrderOperationWechatImpl(RestTemplate restTemplate) {
        super(restTemplate);
        setUrl(url);
    }


    @Override
    public WechatOrderResponse operation(WechatOrderRequestParam wechatOrderRequestParam,String key) {
        String responseStr = restTemplate.postForObject(url, ClassToXml.objectToXML(wechatOrderRequestParam),String.class);
        WechatOrderResponse wechatOrderResponse = null;
        try {
            String responseStrUTF8 = new String(responseStr.getBytes("iso-8859-1"),"UTF-8");
            wechatOrderResponse = ClassToXml.xmlToObject(responseStrUTF8,WechatOrderResponse.class);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return wechatOrderResponse;
    }
}
