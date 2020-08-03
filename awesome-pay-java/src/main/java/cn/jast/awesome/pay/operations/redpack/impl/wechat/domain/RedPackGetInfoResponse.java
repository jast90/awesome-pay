package cn.jast.awesome.pay.operations.redpack.impl.wechat.domain;

import cn.jast.awesome.pay.domain.wechat.BaseWechatResponse;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class RedPackGetInfoResponse extends BaseWechatResponse {
    private String mch_billno;
    private String detail_id;
    private String status;
    private String send_type;
    private String hb_type;
    private int total_num;
    private int total_amount;
    private String reason;
    private String send_time;
    private String refund_time;
    private int refund_amount;
    private String wishing;
    private String remark;
    private String act_name;
    private String hblist;
    private String openid;
    private int amount;
    private String rcv_time;

    public String getMch_billno() {
        return mch_billno;
    }

    public void setMch_billno(String mch_billno) {
        this.mch_billno = mch_billno;
    }

    public String getDetail_id() {
        return detail_id;
    }

    public void setDetail_id(String detail_id) {
        this.detail_id = detail_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSend_type() {
        return send_type;
    }

    public void setSend_type(String send_type) {
        this.send_type = send_type;
    }

    public String getHb_type() {
        return hb_type;
    }

    public void setHb_type(String hb_type) {
        this.hb_type = hb_type;
    }

    public int getTotal_num() {
        return total_num;
    }

    public void setTotal_num(int total_num) {
        this.total_num = total_num;
    }

    public int getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(int total_amount) {
        this.total_amount = total_amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSend_time() {
        return send_time;
    }

    public void setSend_time(String send_time) {
        this.send_time = send_time;
    }

    public String getRefund_time() {
        return refund_time;
    }

    public void setRefund_time(String refund_time) {
        this.refund_time = refund_time;
    }

    public int getRefund_amount() {
        return refund_amount;
    }

    public void setRefund_amount(int refund_amount) {
        this.refund_amount = refund_amount;
    }

    public String getWishing() {
        return wishing;
    }

    public void setWishing(String wishing) {
        this.wishing = wishing;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAct_name() {
        return act_name;
    }

    public void setAct_name(String act_name) {
        this.act_name = act_name;
    }

    public String getHblist() {
        return hblist;
    }

    public void setHblist(String hblist) {
        this.hblist = hblist;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getRcv_time() {
        return rcv_time;
    }

    public void setRcv_time(String rcv_time) {
        this.rcv_time = rcv_time;
    }
}
