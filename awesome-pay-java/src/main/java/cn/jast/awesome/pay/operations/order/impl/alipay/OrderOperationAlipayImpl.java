package cn.jast.awesome.pay.operations.order.impl.alipay;

import cn.jast.awesome.pay.operations.order.OrderOperation;
import cn.jast.awesome.pay.operations.order.impl.alipay.domain.AlipayOrderRequestParam;
import cn.jast.awesome.pay.operations.order.impl.alipay.domain.AlipayOrderResponse;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class OrderOperationAlipayImpl extends OperationBaseAlipayImpl implements OrderOperation<AlipayOrderRequestParam, AlipayOrderResponse> {


    public OrderOperationAlipayImpl(RestTemplate restTemplate) {
        super(restTemplate);
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
