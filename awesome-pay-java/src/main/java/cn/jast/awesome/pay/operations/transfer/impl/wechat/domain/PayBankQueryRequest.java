package cn.jast.awesome.pay.operations.transfer.impl.wechat.domain;

import cn.jast.awesome.pay.domain.wechat.BaseWechatRequest;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class PayBankQueryRequest extends BaseWechatRequest {
    private String partner_trade_no;

    public String getPartner_trade_no() {
        return partner_trade_no;
    }

    public void setPartner_trade_no(String partner_trade_no) {
        this.partner_trade_no = partner_trade_no;
    }
}
