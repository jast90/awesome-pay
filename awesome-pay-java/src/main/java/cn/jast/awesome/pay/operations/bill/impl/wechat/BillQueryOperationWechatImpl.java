package cn.jast.awesome.pay.operations.bill.impl.wechat;

import cn.jast.awesome.pay.operations.bill.BillQueryOperation;
import cn.jast.awesome.pay.operations.bill.impl.wechat.domain.WechatBillQueryRequestParam;
import cn.jast.awesome.pay.operations.bill.impl.wechat.domain.WechatBillQueryResponse;
import cn.jast.awesome.pay.util.ClassToXml;
import org.springframework.web.client.RestTemplate;

public class BillQueryOperationWechatImpl implements BillQueryOperation<WechatBillQueryRequestParam, WechatBillQueryResponse> {

    private final String url = "https://api.mch.weixin.qq.com/pay/downloadbill";

    private RestTemplate restTemplate;

    public BillQueryOperationWechatImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public WechatBillQueryResponse billQuery(WechatBillQueryRequestParam wechatBillQueryRequestParam) {
        WechatBillQueryResponse wechatBillQueryResponse = null;
        String response = restTemplate.postForObject(url, ClassToXml.objectToXML(wechatBillQueryRequestParam),String.class);
        try {
            String xml = new String(response.getBytes("iso-8859-1"),"utf-8");
            wechatBillQueryResponse = ClassToXml.xmlToObject(xml,WechatBillQueryResponse.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return wechatBillQueryResponse;
    }
}
