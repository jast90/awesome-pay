package cn.jast.awesome.pay;

import cn.jast.awesome.pay.operations.AlipayOperation;
import cn.jast.awesome.pay.operations.order.impl.alipay.OrderOperationAlipayImpl;
import cn.jast.awesome.pay.operations.order.impl.alipay.OrderPrepareOperationAlipayImpl;
import cn.jast.awesome.pay.operations.order.impl.alipay.OrderQueryOperationAlipayImpl;
import cn.jast.awesome.pay.operations.order.impl.alipay.OrderRefundOperationAlipayImpl;
import cn.jast.awesome.pay.operations.order.impl.alipay.domain.*;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.Collections;

public class AlipayTemplate implements AlipayOperations {

    private RestTemplate restTemplate;

    public AlipayTemplate() {
        restTemplate = new RestTemplate();
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);
    }

    @Override
    public AlipayOperation<AlipayOrderRequestParam, AlipayOrderResponse> opsForOrder() {
        return new OrderOperationAlipayImpl(restTemplate);
    }

    @Override
    public AlipayOperation<AlipayOrderPrepareRequestParam, AlipayOrderPrepareResponse> opsForOrderPrepare() {
        return new OrderPrepareOperationAlipayImpl(restTemplate);
    }

    @Override
    public AlipayOperation<AlipayOrderQueryRequestOParam, AlipayOrderQueryResponse> opsForOrderQueryOperation() {
        return new OrderQueryOperationAlipayImpl(restTemplate);
    }

    @Override
    public AlipayOperation<AlipayOrderRefundRequestParam, AlipayOrderRefundResponse> opsForOrderRefundOperation() {
        return new OrderRefundOperationAlipayImpl(restTemplate);
    }
}
