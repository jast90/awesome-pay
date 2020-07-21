package cn.jast.awesome.pay.operations.order.impl.wechat;

import cn.jast.awesome.pay.operations.order.OrderPrepareOperation;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderRequestParam;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderResponse;
import cn.jast.awesome.pay.util.ClassToXml;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;

public class OrderPrepareOperationWechatImpl implements OrderPrepareOperation<WechatOrderRequestParam, WechatOrderResponse> {
    private final String url = "https://api.mch.weixin.qq.com/pay/unifiedorder";

    private RestTemplate restTemplate;

    public OrderPrepareOperationWechatImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public WechatOrderResponse orderScan(WechatOrderRequestParam wechatOrderRequestParam) {
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
