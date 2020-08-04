package cn.jast.awesome.pay.operations.order.impl.wechat;

import cn.hutool.json.JSONUtil;
import cn.jast.awesome.pay.WechatPayTemplate;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderRequestParam;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderResponse;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingAddReceiverRequestParam;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingAddReceiverResponse;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingRemoveReceiverRequestParam;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.ProfitSharingRemoveReceiverResponse;
import cn.jast.awesome.pay.util.WechatPayUtil;
import org.junit.Before;
import org.junit.Test;

public class WechatPayTemplateTest {

    private WechatPayTemplate wechatPayTemplate;

    private String key = "123";

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
        WechatOrderResponse wechatOrderResponse = wechatPayTemplate.opsForOrder().operation(wechatOrderRequestParam,key);
        System.out.println(wechatOrderResponse);
    }

    @Test
    public void profitSharingAddReceiver(){
        ProfitSharingAddReceiverRequestParam profitSharingAddReceiverRequestParam = new ProfitSharingAddReceiverRequestParam();
        ProfitSharingAddReceiverRequestParam.Receiver receiver = new ProfitSharingAddReceiverRequestParam.Receiver();
        receiver.setType("MERCHANT_ID");
        receiver.setAccount("86693852");
        receiver.setName("hello");
        receiver.setRelation_type("PARTNER");
        profitSharingAddReceiverRequestParam.setMch_id("1900000100");
        profitSharingAddReceiverRequestParam.setAppid("wx8888888888888888");
        profitSharingAddReceiverRequestParam.setNonceStr();
        profitSharingAddReceiverRequestParam.setSign("123",profitSharingAddReceiverRequestParam,ProfitSharingAddReceiverRequestParam.class
                , WechatPayUtil.SignType.HMACSHA256);
        profitSharingAddReceiverRequestParam.setReceiver(JSONUtil.toJsonStr(receiver));
        ProfitSharingAddReceiverResponse re = wechatPayTemplate.opsForProfitSharingAddReceiver()
                .operation(profitSharingAddReceiverRequestParam,key);
        System.out.println(JSONUtil.toJsonPrettyStr(re));
    }

    @Test
    public void removeReceiver(){
        ProfitSharingRemoveReceiverRequestParam profitSharingRemoveReceiverRequestParam = new ProfitSharingRemoveReceiverRequestParam();
        ProfitSharingRemoveReceiverRequestParam.Receiver receiver = new ProfitSharingRemoveReceiverRequestParam.Receiver();
        receiver.setType("MERCHANT_ID");
        receiver.setAccount("86693852");
        profitSharingRemoveReceiverRequestParam.setMch_id("1900000100");
        profitSharingRemoveReceiverRequestParam.setAppid("wx8888888888888888");
        profitSharingRemoveReceiverRequestParam.setNonceStr();
        profitSharingRemoveReceiverRequestParam.setSign("123",profitSharingRemoveReceiverRequestParam,ProfitSharingRemoveReceiverRequestParam.class
                , WechatPayUtil.SignType.HMACSHA256);
        profitSharingRemoveReceiverRequestParam.setReceiver(JSONUtil.toJsonStr(receiver));
        ProfitSharingRemoveReceiverResponse profitSharingRemoveReceiverResponse = wechatPayTemplate.opsForProfitSharingRemoveReceiver()
                .operation(profitSharingRemoveReceiverRequestParam,key);
        System.out.println(JSONUtil.toJsonPrettyStr(profitSharingRemoveReceiverResponse));
    }
}
