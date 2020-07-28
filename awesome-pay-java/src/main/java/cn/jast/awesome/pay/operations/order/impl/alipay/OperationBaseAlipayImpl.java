package cn.jast.awesome.pay.operations.order.impl.alipay;

import org.springframework.web.client.RestTemplate;

public class OperationBaseAlipayImpl {

    protected final String url = "https://openapi.alipay.com/gateway.do?timestamp={timestamp}&method={method}&app_id={appId}&sign_type={signType}&sign={sign}&version={version}&charset={charset}&biz_content={bizContent}";

    protected RestTemplate restTemplate;

    public OperationBaseAlipayImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
