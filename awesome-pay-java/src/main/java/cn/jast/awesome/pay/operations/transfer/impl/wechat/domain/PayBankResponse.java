package cn.jast.awesome.pay.operations.transfer.impl.wechat.domain;

import cn.jast.awesome.pay.domain.wechat.BaseWechatResponse;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class PayBankResponse extends BaseWechatResponse {
    /**
     * 商户企业付款单号
     */
    private String partner_trade_no;
    /**
     * 代付金额RMB:分
     */
    private int amount;
    /**
     * 微信企业付款单号
     */
    private String payment_no;
    /**
     * 手续费金额 RMB：分
     */
    private int cmms_amt;

    public String getPartner_trade_no() {
        return partner_trade_no;
    }

    public void setPartner_trade_no(String partner_trade_no) {
        this.partner_trade_no = partner_trade_no;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPayment_no() {
        return payment_no;
    }

    public void setPayment_no(String payment_no) {
        this.payment_no = payment_no;
    }

    public int getCmms_amt() {
        return cmms_amt;
    }

    public void setCmms_amt(int cmms_amt) {
        this.cmms_amt = cmms_amt;
    }
}
