package cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain;

import cn.jast.awesome.pay.domain.wechat.BaseWechatRequestParam;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class ProfitSharingQueryRequestParam extends BaseWechatRequestParam {

    private String transaction_id;
    private String out_order_no;

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
}
