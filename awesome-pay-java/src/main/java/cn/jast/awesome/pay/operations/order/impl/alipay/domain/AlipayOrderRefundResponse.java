package cn.jast.awesome.pay.operations.order.impl.alipay.domain;

import cn.jast.awesome.pay.domain.alipay.BaseAlipayResponse;

import java.math.BigDecimal;

public class AlipayOrderRefundResponse{

    private Response alipay_trade_refund_response;
    private String sign;



    public static class Response  extends BaseAlipayResponse {
        private String trade;
        private String out_trade_no;
        private String buyer_logon_id;
        private String fund_change;
        private BigDecimal refund_fee;
        private String refund_currency;
        private String gmt_refund_pay;
        private TradeFundBill tradeFundBill;
        private String store_name;
        private String buyer_user_id;
        private PresetPayToolInfo refund_preset_paytool_list;
        private String refund_settlement_id;
        private String present_refund_buyer_amount;
        private String present_refund_discount_amount;
        private String present_refund_mdiscount_amount;

        public String getTrade() {
            return trade;
        }

        public void setTrade(String trade) {
            this.trade = trade;
        }

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }

        public String getBuyer_logon_id() {
            return buyer_logon_id;
        }

        public void setBuyer_logon_id(String buyer_logon_id) {
            this.buyer_logon_id = buyer_logon_id;
        }

        public String getFund_change() {
            return fund_change;
        }

        public void setFund_change(String fund_change) {
            this.fund_change = fund_change;
        }

        public BigDecimal getRefund_fee() {
            return refund_fee;
        }

        public void setRefund_fee(BigDecimal refund_fee) {
            this.refund_fee = refund_fee;
        }

        public String getRefund_currency() {
            return refund_currency;
        }

        public void setRefund_currency(String refund_currency) {
            this.refund_currency = refund_currency;
        }

        public String getGmt_refund_pay() {
            return gmt_refund_pay;
        }

        public void setGmt_refund_pay(String gmt_refund_pay) {
            this.gmt_refund_pay = gmt_refund_pay;
        }

        public TradeFundBill getTradeFundBill() {
            return tradeFundBill;
        }

        public void setTradeFundBill(TradeFundBill tradeFundBill) {
            this.tradeFundBill = tradeFundBill;
        }

        public String getStore_name() {
            return store_name;
        }

        public void setStore_name(String store_name) {
            this.store_name = store_name;
        }

        public String getBuyer_user_id() {
            return buyer_user_id;
        }

        public void setBuyer_user_id(String buyer_user_id) {
            this.buyer_user_id = buyer_user_id;
        }

        public PresetPayToolInfo getRefund_preset_paytool_list() {
            return refund_preset_paytool_list;
        }

        public void setRefund_preset_paytool_list(PresetPayToolInfo refund_preset_paytool_list) {
            this.refund_preset_paytool_list = refund_preset_paytool_list;
        }

        public String getRefund_settlement_id() {
            return refund_settlement_id;
        }

        public void setRefund_settlement_id(String refund_settlement_id) {
            this.refund_settlement_id = refund_settlement_id;
        }

        public String getPresent_refund_buyer_amount() {
            return present_refund_buyer_amount;
        }

        public void setPresent_refund_buyer_amount(String present_refund_buyer_amount) {
            this.present_refund_buyer_amount = present_refund_buyer_amount;
        }

        public String getPresent_refund_discount_amount() {
            return present_refund_discount_amount;
        }

        public void setPresent_refund_discount_amount(String present_refund_discount_amount) {
            this.present_refund_discount_amount = present_refund_discount_amount;
        }

        public String getPresent_refund_mdiscount_amount() {
            return present_refund_mdiscount_amount;
        }

        public void setPresent_refund_mdiscount_amount(String present_refund_mdiscount_amount) {
            this.present_refund_mdiscount_amount = present_refund_mdiscount_amount;
        }
    }

    public static class TradeFundBill{
        private String fund_channel;
        private String bank_code;
        private String amount;
        private String real_amount;
        private String fund_type;

        public String getFund_channel() {
            return fund_channel;
        }

        public void setFund_channel(String fund_channel) {
            this.fund_channel = fund_channel;
        }

        public String getBank_code() {
            return bank_code;
        }

        public void setBank_code(String bank_code) {
            this.bank_code = bank_code;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getReal_amount() {
            return real_amount;
        }

        public void setReal_amount(String real_amount) {
            this.real_amount = real_amount;
        }

        public String getFund_type() {
            return fund_type;
        }

        public void setFund_type(String fund_type) {
            this.fund_type = fund_type;
        }
    }

    public static class PresetPayToolInfo{
        private BigDecimal[] amount;
        private String assert_type_code;

        public BigDecimal[] getAmount() {
            return amount;
        }

        public void setAmount(BigDecimal[] amount) {
            this.amount = amount;
        }

        public String getAssert_type_code() {
            return assert_type_code;
        }

        public void setAssert_type_code(String assert_type_code) {
            this.assert_type_code = assert_type_code;
        }
    }

    public Response getAlipay_trade_refund_response() {
        return alipay_trade_refund_response;
    }

    public void setAlipay_trade_refund_response(Response alipay_trade_refund_response) {
        this.alipay_trade_refund_response = alipay_trade_refund_response;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
