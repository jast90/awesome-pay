package cn.jast.awesome.pay.operations.order.impl.wechat;

import cn.jast.awesome.pay.operations.order.OrderCloseOperation;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderCloseRequestParam;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderCloseResponse;
import cn.jast.awesome.pay.util.ClassToXml;
import org.springframework.web.client.RestTemplate;

public class OrderCloseOperationWechatImpl implements OrderCloseOperation<WechatOrderCloseRequestParam, WechatOrderCloseResponse> {

    private final String url = "https://api.mch.weixin.qq.com/pay/closeorder";

    private RestTemplate restTemplate;

    public OrderCloseOperationWechatImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public WechatOrderCloseResponse orderClose(WechatOrderCloseRequestParam wechatOrderCloseRequestParam) {
        String xml = restTemplate.postForObject(url, ClassToXml.objectToXML(wechatOrderCloseRequestParam),String.class);
        WechatOrderCloseResponse wechatOrderCloseResponse = null;
        try {
            String responseStr = new String(xml.getBytes("iso-8859-1"),"utf-8");
            wechatOrderCloseResponse = ClassToXml.xmlToObject(responseStr, WechatOrderCloseResponse.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return wechatOrderCloseResponse;
    }
}
