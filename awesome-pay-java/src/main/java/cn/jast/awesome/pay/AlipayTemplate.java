package cn.jast.awesome.pay;

import cn.jast.awesome.pay.operations.order.OrderOperation;
import cn.jast.awesome.pay.operations.order.impl.alipay.OrderOperationAlipayImpl;
import cn.jast.awesome.pay.operations.order.impl.alipay.domain.AlipayOrderRequestParam;
import cn.jast.awesome.pay.operations.order.impl.alipay.domain.AlipayOrderResponse;
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
    public OrderOperation<AlipayOrderRequestParam, AlipayOrderResponse> opsForOrder() {
        return new OrderOperationAlipayImpl(restTemplate);
    }
}
