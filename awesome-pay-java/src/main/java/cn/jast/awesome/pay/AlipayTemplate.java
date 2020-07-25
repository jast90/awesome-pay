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

    private RestTemplate sslRestTemplate;

    private String p12URI;

    public AlipayTemplate() {
        restTemplate = new RestTemplate();
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);
    }

    public AlipayTemplate(String p12URI) {
        this();
        //TODO 通过 RestTemplate 发送https请求
        this.p12URI = p12URI;
        sslRestTemplate = new RestTemplate();
    }


    @Override
    public OrderOperation<AlipayOrderRequestParam, AlipayOrderResponse> opsForOrder() {
        return new OrderOperationAlipayImpl(restTemplate);
    }
}
