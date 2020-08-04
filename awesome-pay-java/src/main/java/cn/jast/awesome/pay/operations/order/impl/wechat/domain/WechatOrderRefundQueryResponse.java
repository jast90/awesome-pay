package cn.jast.awesome.pay.operations.order.impl.wechat.domain;

import cn.jast.awesome.pay.domain.wechat.BaseWechatResponse;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class WechatOrderRefundQueryResponse extends BaseWechatResponse {
    private String total_refund_count;
    private String transaction_id;
    private String out_trade_no;
    private String total_fee;
    private String settlement_total_fee;
    private String fee_type;
    private String cash_fee;
    private String refund_count;
    private String out_refund_no_$n;
    private String refund_id_$n	;
    private String refund_channel_$n;
    private String refund_fee_$n;
    private String settlement_refund_fee_$n;
    private String coupon_type_$n_$m;
    private String coupon_refund_fee_$n;
    private String coupon_refund_count_$n;
    private String coupon_refund_id_$n_$m;
    private String coupon_refund_fee_$n_$m;
    private String refund_status_$n;
    private String refund_account_$n;
    private String refund_recv_accout_$n;
    private String refund_success_time_$n;

    public String getTotal_refund_count() {
        return total_refund_count;
    }

    public void setTotal_refund_count(String total_refund_count) {
        this.total_refund_count = total_refund_count;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(String total_fee) {
        this.total_fee = total_fee;
    }

    public String getSettlement_total_fee() {
        return settlement_total_fee;
    }

    public void setSettlement_total_fee(String settlement_total_fee) {
        this.settlement_total_fee = settlement_total_fee;
    }

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public String getCash_fee() {
        return cash_fee;
    }

    public void setCash_fee(String cash_fee) {
        this.cash_fee = cash_fee;
    }

    public String getRefund_count() {
        return refund_count;
    }

    public void setRefund_count(String refund_count) {
        this.refund_count = refund_count;
    }

    public String getOut_refund_no_$n() {
        return out_refund_no_$n;
    }

    public void setOut_refund_no_$n(String out_refund_no_$n) {
        this.out_refund_no_$n = out_refund_no_$n;
    }

    public String getRefund_id_$n() {
        return refund_id_$n;
    }

    public void setRefund_id_$n(String refund_id_$n) {
        this.refund_id_$n = refund_id_$n;
    }

    public String getRefund_channel_$n() {
        return refund_channel_$n;
    }

    public void setRefund_channel_$n(String refund_channel_$n) {
        this.refund_channel_$n = refund_channel_$n;
    }

    public String getRefund_fee_$n() {
        return refund_fee_$n;
    }

    public void setRefund_fee_$n(String refund_fee_$n) {
        this.refund_fee_$n = refund_fee_$n;
    }

    public String getSettlement_refund_fee_$n() {
        return settlement_refund_fee_$n;
    }

    public void setSettlement_refund_fee_$n(String settlement_refund_fee_$n) {
        this.settlement_refund_fee_$n = settlement_refund_fee_$n;
    }

    public String getCoupon_type_$n_$m() {
        return coupon_type_$n_$m;
    }

    public void setCoupon_type_$n_$m(String coupon_type_$n_$m) {
        this.coupon_type_$n_$m = coupon_type_$n_$m;
    }

    public String getCoupon_refund_fee_$n() {
        return coupon_refund_fee_$n;
    }

    public void setCoupon_refund_fee_$n(String coupon_refund_fee_$n) {
        this.coupon_refund_fee_$n = coupon_refund_fee_$n;
    }

    public String getCoupon_refund_count_$n() {
        return coupon_refund_count_$n;
    }

    public void setCoupon_refund_count_$n(String coupon_refund_count_$n) {
        this.coupon_refund_count_$n = coupon_refund_count_$n;
    }

    public String getCoupon_refund_id_$n_$m() {
        return coupon_refund_id_$n_$m;
    }

    public void setCoupon_refund_id_$n_$m(String coupon_refund_id_$n_$m) {
        this.coupon_refund_id_$n_$m = coupon_refund_id_$n_$m;
    }

    public String getCoupon_refund_fee_$n_$m() {
        return coupon_refund_fee_$n_$m;
    }

    public void setCoupon_refund_fee_$n_$m(String coupon_refund_fee_$n_$m) {
        this.coupon_refund_fee_$n_$m = coupon_refund_fee_$n_$m;
    }

    public String getRefund_status_$n() {
        return refund_status_$n;
    }

    public void setRefund_status_$n(String refund_status_$n) {
        this.refund_status_$n = refund_status_$n;
    }

    public String getRefund_account_$n() {
        return refund_account_$n;
    }

    public void setRefund_account_$n(String refund_account_$n) {
        this.refund_account_$n = refund_account_$n;
    }

    public String getRefund_recv_accout_$n() {
        return refund_recv_accout_$n;
    }

    public void setRefund_recv_accout_$n(String refund_recv_accout_$n) {
        this.refund_recv_accout_$n = refund_recv_accout_$n;
    }

    public String getRefund_success_time_$n() {
        return refund_success_time_$n;
    }

    public void setRefund_success_time_$n(String refund_success_time_$n) {
        this.refund_success_time_$n = refund_success_time_$n;
    }
}
