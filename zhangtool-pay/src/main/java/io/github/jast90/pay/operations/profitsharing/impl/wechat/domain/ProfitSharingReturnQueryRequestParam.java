package io.github.jast90.pay.operations.profitsharing.impl.wechat.domain;

import io.github.jast90.pay.domain.wechat.BaseWechatRequest;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class ProfitSharingReturnQueryRequestParam extends BaseWechatRequest {

    private String order_id;
    private String out_order_no;
    private String out_return_no;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOut_order_no() {
        return out_order_no;
    }

    public void setOut_order_no(String out_order_no) {
        this.out_order_no = out_order_no;
    }

    public String getOut_return_no() {
        return out_return_no;
    }

    public void setOut_return_no(String out_return_no) {
        this.out_return_no = out_return_no;
    }
}
