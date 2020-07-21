package cn.jast.awesome.pay.operations.order.impl.wechat;

import cn.jast.awesome.pay.operations.order.OrderQueryOperation;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderQueryRequestParam;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderQueryResponse;
import cn.jast.awesome.pay.util.ClassToXml;
import org.springframework.web.client.RestTemplate;

public class OrderQueryOperationWechatImpl implements OrderQueryOperation<WechatOrderQueryRequestParam, WechatOrderQueryResponse> {
    private final String url = "https://api.mch.weixin.qq.com/pay/orderquery";

    private RestTemplate restTemplate;

    public OrderQueryOperationWechatImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public WechatOrderQueryResponse orderQuery(WechatOrderQueryRequestParam wechatOrderQueryRequestParam) {
        String xml = restTemplate.postForObject(url, ClassToXml.objectToXML(wechatOrderQueryRequestParam),String.class);
        WechatOrderQueryResponse wechatOrderQueryResponse = null;
        try {
            String response = new String(xml.getBytes("iso-8859-1"),"uft-8");
            wechatOrderQueryResponse = ClassToXml.xmlToObject(response,WechatOrderQueryResponse.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return wechatOrderQueryResponse;
    }
}
