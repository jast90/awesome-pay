package cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain;

import cn.jast.awesome.pay.domain.wechat.BaseWechatResponse;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class ProfitSharingReturnQueryResponse extends BaseWechatResponse {

    private String order_id;
    private String out_order_no;
    private String out_return_no;
    private String return_no;
    private String return_account_type;
    private String return_account;
    private int return_amount;
    private String description;
    private String result;
    private String fail_reason;
    private String finish_time;

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

    public String getReturn_no() {
        return return_no;
    }

    public void setReturn_no(String return_no) {
        this.return_no = return_no;
    }

    public String getReturn_account_type() {
        return return_account_type;
    }

    public void setReturn_account_type(String return_account_type) {
        this.return_account_type = return_account_type;
    }

    public String getReturn_account() {
        return return_account;
    }

    public void setReturn_account(String return_account) {
        this.return_account = return_account;
    }

    public int getReturn_amount() {
        return return_amount;
    }

    public void setReturn_amount(int return_amount) {
        this.return_amount = return_amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getFail_reason() {
        return fail_reason;
    }

    public void setFail_reason(String fail_reason) {
        this.fail_reason = fail_reason;
    }

    public String getFinish_time() {
        return finish_time;
    }

    public void setFinish_time(String finish_time) {
        this.finish_time = finish_time;
    }
}
