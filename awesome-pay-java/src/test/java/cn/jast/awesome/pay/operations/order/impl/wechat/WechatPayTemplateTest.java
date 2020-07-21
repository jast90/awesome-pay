package cn.jast.awesome.pay.operations.order.impl.wechat;

import cn.jast.awesome.pay.WechatPayTemplate;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderRequestParam;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderResponse;
import org.junit.Before;
import org.junit.Test;

public class WechatPayTemplateTest {

    private WechatPayTemplate wechatPayTemplate;

    @Before
    public void setUp(){
        wechatPayTemplate = new WechatPayTemplate();

    }

    @Test
    public void order(){
        WechatOrderResponse wechatOrderResponse = wechatPayTemplate.opsForOrder().order(new WechatOrderRequestParam());
        System.out.println(wechatOrderResponse);
    }
}
