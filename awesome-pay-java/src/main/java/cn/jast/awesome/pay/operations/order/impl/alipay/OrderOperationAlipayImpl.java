package cn.jast.awesome.pay.operations.order.impl.alipay;

import cn.jast.awesome.pay.operations.order.OrderOperation;
import cn.jast.awesome.pay.operations.order.impl.alipay.domain.AlipayOrderRequestParam;
import cn.jast.awesome.pay.operations.order.impl.alipay.domain.AlipayOrderResponse;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class OrderOperationAlipayImpl implements OrderOperation<AlipayOrderRequestParam, AlipayOrderResponse> {

    private final String url = "https://openapi.alipay.com/gateway.do?timestamp={timestamp}&method={method}&app_id={appId}&sign_type={signType}&sign={sign}&version={version}&charset={charset}&biz_content={bizContent}";

    private RestTemplate restTemplate;

    public OrderOperationAlipayImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public AlipayOrderResponse order(AlipayOrderRequestParam alipayOrderRequestParam) {
        Map<String,String> map = new HashMap<>();
        map.put("timestamp",alipayOrderRequestParam.getTimestamp());
        map.put("method",alipayOrderRequestParam.getMethod());
        map.put("appId",alipayOrderRequestParam.getApp_id());
        map.put("signType",alipayOrderRequestParam.getSign_type());
        map.put("sign",alipayOrderRequestParam.getSign());
        map.put("version",alipayOrderRequestParam.getVersion());
        map.put("charset",alipayOrderRequestParam.getCharset());
        map.put("bizContent",alipayOrderRequestParam.getBiz_content());
        AlipayOrderResponse response = restTemplate.getForObject(url,AlipayOrderResponse.class,map);
        return response;
    }
}
