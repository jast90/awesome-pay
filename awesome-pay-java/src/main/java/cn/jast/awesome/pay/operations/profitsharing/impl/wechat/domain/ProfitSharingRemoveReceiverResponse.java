package cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain;

import cn.jast.awesome.pay.domain.wechat.BaseWechatResponse;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class ProfitSharingRemoveReceiverResponse extends BaseWechatResponse {
    private String receiver;

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}
