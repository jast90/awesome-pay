package cn.jast.awesome.pay.operations.bill.impl.wechat.domain;

import cn.jast.awesome.pay.domain.wechat.BaseWechatRequest;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class WechatBillQueryRequestParam extends BaseWechatRequest {

    private String appid;
    private String mch_id;
    private String nonce_str;
    private String sign_type;
    private String bill_date;
    private String bill_type;
    private String tar_type;

    public String getBill_date() {
        return bill_date;
    }

    public void setBill_date(String bill_date) {
        this.bill_date = bill_date;
    }

    public String getBill_type() {
        return bill_type;
    }

    public void setBill_type(String bill_type) {
        this.bill_type = bill_type;
    }

    public String getTar_type() {
        return tar_type;
    }

    public void setTar_type(String tar_type) {
        this.tar_type = tar_type;
    }
}
