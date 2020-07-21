package cn.jast.awesome.pay.operations.order.impl.wechat;

import cn.jast.awesome.pay.operations.order.OrderRefundQueryOperation;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderRefundQueryRequestParam;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderRefundQueryResponse;
import cn.jast.awesome.pay.util.ClassToXml;
import org.springframework.web.client.RestTemplate;

public class OrderRefundQueryOperationWechatImpl implements OrderRefundQueryOperation<WechatOrderRefundQueryRequestParam
        , WechatOrderRefundQueryResponse> {

    private  final String url = "https://api.mch.weixin.qq.com/pay/refundquery";

    private RestTemplate restTemplate;

    public OrderRefundQueryOperationWechatImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public WechatOrderRefundQueryResponse orderRefundQuery(WechatOrderRefundQueryRequestParam wechatOrderRefundQueryRequestParam) {
        String xml = restTemplate.postForObject(url, ClassToXml.objectToXML(wechatOrderRefundQueryRequestParam),String.class);
        WechatOrderRefundQueryResponse wechatOrderRefundQueryResponse = null;
        try {
            String response = new String(xml.getBytes("iso-8859-1"),"utf-8");
            wechatOrderRefundQueryResponse = ClassToXml.xmlToObject(response,WechatOrderRefundQueryResponse.class);
        }catch (Exception e){

        }
        return null;
    }
}
