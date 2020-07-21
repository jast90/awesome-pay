package cn.jast.awesome.pay.operations.order.impl.wechat;

import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderRequestParam;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class OrderOperationWechatImplTest {

    private OrderOperationWechatImpl orderOperationWechatImpl;

    @Before
    public void setUp(){
        orderOperationWechatImpl = new OrderOperationWechatImpl(new RestTemplate());

    }

    @Test
    public void order(){
        orderOperationWechatImpl.order(new WechatOrderRequestParam());
    }
}
