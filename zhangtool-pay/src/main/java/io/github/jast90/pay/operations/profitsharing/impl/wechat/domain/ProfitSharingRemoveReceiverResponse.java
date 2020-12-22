package io.github.jast90.pay.operations.profitsharing.impl.wechat.domain;

import io.github.jast90.pay.domain.wechat.BaseWechatResponse;
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
