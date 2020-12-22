package io.github.jast90.pay.operations.transfer.impl.wechat.domain;

import io.github.jast90.pay.domain.wechat.BaseWechatResponse;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class PayBankQueryResponse extends BaseWechatResponse {
    private String partner_trade_no;
    private String payment_no;
    private String bank_no_md5;
    private String true_name_md5;
    private int amount;
    private String status;
    private String cmms_amt;
    private String create_time;
    private String pay_succ_time;
    private String reason;

    public String getPartner_trade_no() {
        return partner_trade_no;
    }

    public void setPartner_trade_no(String partner_trade_no) {
        this.partner_trade_no = partner_trade_no;
    }

    public String getPayment_no() {
        return payment_no;
    }

    public void setPayment_no(String payment_no) {
        this.payment_no = payment_no;
    }

    public String getBank_no_md5() {
        return bank_no_md5;
    }

    public void setBank_no_md5(String bank_no_md5) {
        this.bank_no_md5 = bank_no_md5;
    }

    public String getTrue_name_md5() {
        return true_name_md5;
    }

    public void setTrue_name_md5(String true_name_md5) {
        this.true_name_md5 = true_name_md5;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCmms_amt() {
        return cmms_amt;
    }

    public void setCmms_amt(String cmms_amt) {
        this.cmms_amt = cmms_amt;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getPay_succ_time() {
        return pay_succ_time;
    }

    public void setPay_succ_time(String pay_succ_time) {
        this.pay_succ_time = pay_succ_time;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
