package cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain;

import cn.jast.awesome.pay.domain.wechat.BaseWechatRequest;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class ProfitSharingRequestParam extends BaseWechatRequest {
    private String transaction_id;
    private String out_order_no;
    private String receivers;

    public static class Receiver{
        private String type;
        private String account;
        /**
         * 分
         */
        private int amount;

        private String description;

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

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getOut_order_no() {
        return out_order_no;
    }

    public void setOut_order_no(String out_order_no) {
        this.out_order_no = out_order_no;
    }

    public String getReceivers() {
        return receivers;
    }

    public void setReceivers(String receivers) {
        this.receivers = receivers;
    }
}
