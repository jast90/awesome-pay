package cn.jast.awesome.pay.operations.bill.impl.wechat.domain;

import cn.jast.awesome.pay.domain.wechat.BaseWechatResponse;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class WechatBillQueryResponse extends BaseWechatResponse {
    private String error_code;

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }
}