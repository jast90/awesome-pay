package io.github.jast90.pay.operations.profitsharing.impl.wechat.domain;

import io.github.jast90.pay.domain.wechat.BaseWechatRequest;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class ProfitSharingRemoveReceiverRequestParam extends BaseWechatRequest {
    private String receiver;

    public static class Receiver{
        private String type;
        private String account;

        public Receiver() {
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }
    }


    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
}
