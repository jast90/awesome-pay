package io.github.jast90.pay.operations.order.impl.wechat;

import cn.hutool.json.JSONUtil;
import io.github.jast90.pay.AlipayTemplate;
import io.github.jast90.pay.operations.order.impl.alipay.domain.AlipayOrderRequestParam;
import io.github.jast90.pay.operations.order.impl.alipay.domain.AlipayOrderResponse;
import org.junit.Before;
import org.junit.Test;

public class AlipayTemplateTest {

    private AlipayTemplate alipayTemplate;
    private String privateKey;

    @Before
    public void setUp(){
        alipayTemplate = new AlipayTemplate();
        privateKey = "123";
    }

    @Test
    public void order(){
        AlipayOrderRequestParam.BizContent bizContent = new AlipayOrderRequestParam.BizContent();
        bizContent.setBuyer_id("123");
        AlipayOrderRequestParam alipayOrderRequestParam = new AlipayOrderRequestParam(bizContent,privateKey);
        alipayOrderRequestParam.setApp_id("123455");
        AlipayOrderResponse alipayOrderResponse = alipayTemplate.opsForOrder().operation(alipayOrderRequestParam);
        System.out.println(JSONUtil.toJsonPrettyStr(alipayOrderResponse));
    }
}
