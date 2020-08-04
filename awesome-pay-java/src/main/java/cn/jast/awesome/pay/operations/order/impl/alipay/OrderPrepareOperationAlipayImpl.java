package cn.jast.awesome.pay.operations.order.impl.alipay;

import cn.jast.awesome.pay.operations.AlipayOperation;
import cn.jast.awesome.pay.operations.order.impl.alipay.domain.AlipayOrderPrepareRequestParam;
import cn.jast.awesome.pay.operations.order.impl.alipay.domain.AlipayOrderPrepareResponse;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class OrderPrepareOperationAlipayImpl extends OperationBaseAlipayImpl implements
        AlipayOperation<AlipayOrderPrepareRequestParam, AlipayOrderPrepareResponse> {


    public OrderPrepareOperationAlipayImpl(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    public AlipayOrderPrepareResponse operation(AlipayOrderPrepareRequestParam alipayOrderPrepareRequestParam) {
        Map<String,String> map = new HashMap<>();
        map.put("timestamp",alipayOrderPrepareRequestParam.getTimestamp());
        map.put("method",alipayOrderPrepareRequestParam.getMethod());
        map.put("appId",alipayOrderPrepareRequestParam.getApp_id());
        map.put("signType",alipayOrderPrepareRequestParam.getSign_type());
        map.put("sign",alipayOrderPrepareRequestParam.getSign());
        map.put("version",alipayOrderPrepareRequestParam.getVersion());
        map.put("charset",alipayOrderPrepareRequestParam.getCharset());
        map.put("bizContent",alipayOrderPrepareRequestParam.getBiz_content());
        AlipayOrderPrepareResponse response = restTemplate.getForObject(url,AlipayOrderPrepareResponse.class,map);
        return response;
    }
}
