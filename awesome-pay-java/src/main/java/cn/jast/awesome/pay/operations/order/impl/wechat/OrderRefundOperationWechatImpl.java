package cn.jast.awesome.pay.operations.order.impl.wechat;

import cn.jast.awesome.pay.operations.order.OrderRefundOperation;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderRefundRequestParam;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderRefundResponse;
import cn.jast.awesome.pay.util.ClassToXml;
import org.springframework.web.client.RestTemplate;


public class OrderRefundOperationWechatImpl implements OrderRefundOperation<WechatOrderRefundRequestParam, WechatOrderRefundResponse> {

    private final String url = "https://api.mch.weixin.qq.com/secapi/pay/refund";

    private RestTemplate restTemplate;

    /**
     * 需要证书
     */
    private boolean requireCA = true;

    public OrderRefundOperationWechatImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public WechatOrderRefundResponse orderRefund(WechatOrderRefundRequestParam wechatOrderRefundRequestParam) {
        String xml = restTemplate.postForObject(url, ClassToXml.objectToXML(wechatOrderRefundRequestParam),String.class);
        WechatOrderRefundResponse wechatOrderRefundResponse = null;
        try {
            String response = new String(xml.getBytes("iso-8859-1"),"uft-8");
            wechatOrderRefundResponse = ClassToXml.xmlToObject(response,WechatOrderRefundResponse.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return wechatOrderRefundResponse;
    }
}
