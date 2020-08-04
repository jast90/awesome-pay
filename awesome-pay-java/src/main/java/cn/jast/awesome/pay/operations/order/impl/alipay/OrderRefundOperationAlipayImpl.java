package cn.jast.awesome.pay.operations.order.impl.alipay;

import cn.jast.awesome.pay.operations.AlipayOperation;
import cn.jast.awesome.pay.operations.order.impl.alipay.domain.AlipayOrderRefundRequestParam;
import cn.jast.awesome.pay.operations.order.impl.alipay.domain.AlipayOrderRefundResponse;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class OrderRefundOperationAlipayImpl extends OperationBaseAlipayImpl implements
        AlipayOperation<AlipayOrderRefundRequestParam,AlipayOrderRefundResponse> {

    public OrderRefundOperationAlipayImpl(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    public AlipayOrderRefundResponse operation(AlipayOrderRefundRequestParam alipayOrderRefundRequestParam) {
        Map<String,String> map = new HashMap<>();
        map.put("timestamp",alipayOrderRefundRequestParam.getTimestamp());
        map.put("method",alipayOrderRefundRequestParam.getMethod());
        map.put("appId",alipayOrderRefundRequestParam.getApp_id());
        map.put("signType",alipayOrderRefundRequestParam.getSign_type());
        map.put("sign",alipayOrderRefundRequestParam.getSign());
        map.put("version",alipayOrderRefundRequestParam.getVersion());
        map.put("charset",alipayOrderRefundRequestParam.getCharset());
        map.put("bizContent",alipayOrderRefundRequestParam.getBiz_content());
        AlipayOrderRefundResponse response = restTemplate.getForObject(url,AlipayOrderRefundResponse.class,map);
        return response;
    }
}
