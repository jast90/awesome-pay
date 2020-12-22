package io.github.jast90.pay.operations.order.impl.alipay;

import io.github.jast90.pay.operations.AlipayOperation;
import io.github.jast90.pay.operations.order.impl.alipay.domain.AlipayOrderQueryRequestOParam;
import io.github.jast90.pay.operations.order.impl.alipay.domain.AlipayOrderQueryResponse;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class OrderQueryOperationAlipayImpl extends OperationBaseAlipayImpl implements
        AlipayOperation<AlipayOrderQueryRequestOParam, AlipayOrderQueryResponse> {

    public OrderQueryOperationAlipayImpl(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    public AlipayOrderQueryResponse operation(AlipayOrderQueryRequestOParam alipayOrderQueryRequestOParam) {
        Map<String,String> map = new HashMap<>();
        map.put("timestamp",alipayOrderQueryRequestOParam.getTimestamp());
        map.put("method",alipayOrderQueryRequestOParam.getMethod());
        map.put("appId",alipayOrderQueryRequestOParam.getApp_id());
        map.put("signType",alipayOrderQueryRequestOParam.getSign_type());
        map.put("sign",alipayOrderQueryRequestOParam.getSign());
        map.put("version",alipayOrderQueryRequestOParam.getVersion());
        map.put("charset",alipayOrderQueryRequestOParam.getCharset());
        map.put("bizContent",alipayOrderQueryRequestOParam.getBiz_content());
        AlipayOrderQueryResponse response = restTemplate.getForObject(url,AlipayOrderQueryResponse.class,map);
        return response;
    }
}
