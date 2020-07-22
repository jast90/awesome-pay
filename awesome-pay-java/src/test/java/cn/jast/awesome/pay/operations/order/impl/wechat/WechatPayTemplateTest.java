package cn.jast.awesome.pay.operations.order.impl.wechat;

import cn.jast.awesome.pay.WechatPayTemplate;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderRequestParam;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderResponse;
import cn.jast.awesome.pay.util.WechatPayUtil;
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
        WechatOrderRequestParam wechatOrderRequestParam = new WechatOrderRequestParam();
        wechatOrderRequestParam.setMch_id("1230000109");
        wechatOrderRequestParam.setSign("123",wechatOrderRequestParam,WechatOrderRequestParam.class,
                WechatPayUtil.SignType.MD5);
        wechatOrderRequestParam.setNonceStr();
        System.out.println(wechatOrderRequestParam);
        WechatOrderResponse wechatOrderResponse = wechatPayTemplate.opsForOrder().order(wechatOrderRequestParam);
        System.out.println(wechatOrderResponse);
    }
}
