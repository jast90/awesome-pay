package cn.jast.awesome.pay.operations.order.impl.alipay.domain;

import cn.jast.awesome.pay.domain.alipay.BaseAlipayResponse;

import java.math.BigDecimal;

public class AlipayOrderQueryResponse {

    public static class Response extends BaseAlipayResponse {
        private String trade_no;
        private String out_trade_no;
        private String buyer_logon_id;
        private String trade_status;
        private BigDecimal total_amount;
        private String trans_currency;
        private String settle_currency;
        private BigDecimal settle_amount;
        private BigDecimal pay_currency;
        private String pay_amount;
        private String settle_trans_rate;
        private String trans_pay_rate;
        private BigDecimal buyer_pay_amount;
        private BigDecimal point_amount;
        private BigDecimal invoice_amount;
        private String send_pay_date;
        private String receipt_amount;
        private String store_id;
        private String terminal_id;
        private TradeFundBill tradeFundBill;
        private String store_name;
        private String buyer_user_id;
        private String charge_amount;
        private String charge_flags;
        private String settlement_id;
        private TradeSettleInfo tradeSettleInfo;
        private String auth_trade_pay_mode;
        private String buyer_user_type;
        private String mdiscount_amount;
        private String discount_amount;
        private String buyer_user_name;
        private String subject;
        private String body;
        private String alipay_sub_merchant_id;
        private String ext_infos;

        public String getTrade_no() {
            return trade_no;
        }

        public void setTrade_no(String trade_no) {
            this.trade_no = trade_no;
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

        public String getTrade_status() {
            return trade_status;
        }

        public void setTrade_status(String trade_status) {
            this.trade_status = trade_status;
        }

        public BigDecimal getTotal_amount() {
            return total_amount;
        }

        public void setTotal_amount(BigDecimal total_amount) {
            this.total_amount = total_amount;
        }

        public String getTrans_currency() {
            return trans_currency;
        }

        public void setTrans_currency(String trans_currency) {
            this.trans_currency = trans_currency;
        }

        public String getSettle_currency() {
            return settle_currency;
        }

        public void setSettle_currency(String settle_currency) {
            this.settle_currency = settle_currency;
        }

        public BigDecimal getSettle_amount() {
            return settle_amount;
        }

        public void setSettle_amount(BigDecimal settle_amount) {
            this.settle_amount = settle_amount;
        }

        public BigDecimal getPay_currency() {
            return pay_currency;
        }

        public void setPay_currency(BigDecimal pay_currency) {
            this.pay_currency = pay_currency;
        }

        public String getPay_amount() {
            return pay_amount;
        }

        public void setPay_amount(String pay_amount) {
            this.pay_amount = pay_amount;
        }

        public String getSettle_trans_rate() {
            return settle_trans_rate;
        }

        public void setSettle_trans_rate(String settle_trans_rate) {
            this.settle_trans_rate = settle_trans_rate;
        }

        public String getTrans_pay_rate() {
            return trans_pay_rate;
        }

        public void setTrans_pay_rate(String trans_pay_rate) {
            this.trans_pay_rate = trans_pay_rate;
        }

        public BigDecimal getBuyer_pay_amount() {
            return buyer_pay_amount;
        }

        public void setBuyer_pay_amount(BigDecimal buyer_pay_amount) {
            this.buyer_pay_amount = buyer_pay_amount;
        }

        public BigDecimal getPoint_amount() {
            return point_amount;
        }

        public void setPoint_amount(BigDecimal point_amount) {
            this.point_amount = point_amount;
        }

        public BigDecimal getInvoice_amount() {
            return invoice_amount;
        }

        public void setInvoice_amount(BigDecimal invoice_amount) {
            this.invoice_amount = invoice_amount;
        }

        public String getSend_pay_date() {
            return send_pay_date;
        }

        public void setSend_pay_date(String send_pay_date) {
            this.send_pay_date = send_pay_date;
        }

        public String getReceipt_amount() {
            return receipt_amount;
        }

        public void setReceipt_amount(String receipt_amount) {
            this.receipt_amount = receipt_amount;
        }

        public String getStore_id() {
            return store_id;
        }

        public void setStore_id(String store_id) {
            this.store_id = store_id;
        }

        public String getTerminal_id() {
            return terminal_id;
        }

        public void setTerminal_id(String terminal_id) {
            this.terminal_id = terminal_id;
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

        public String getCharge_amount() {
            return charge_amount;
        }

        public void setCharge_amount(String charge_amount) {
            this.charge_amount = charge_amount;
        }

        public String getCharge_flags() {
            return charge_flags;
        }

        public void setCharge_flags(String charge_flags) {
            this.charge_flags = charge_flags;
        }

        public String getSettlement_id() {
            return settlement_id;
        }

        public void setSettlement_id(String settlement_id) {
            this.settlement_id = settlement_id;
        }

        public TradeSettleInfo getTradeSettleInfo() {
            return tradeSettleInfo;
        }

        public void setTradeSettleInfo(TradeSettleInfo tradeSettleInfo) {
            this.tradeSettleInfo = tradeSettleInfo;
        }

        public String getAuth_trade_pay_mode() {
            return auth_trade_pay_mode;
        }

        public void setAuth_trade_pay_mode(String auth_trade_pay_mode) {
            this.auth_trade_pay_mode = auth_trade_pay_mode;
        }

        public String getBuyer_user_type() {
            return buyer_user_type;
        }

        public void setBuyer_user_type(String buyer_user_type) {
            this.buyer_user_type = buyer_user_type;
        }

        public String getMdiscount_amount() {
            return mdiscount_amount;
        }

        public void setMdiscount_amount(String mdiscount_amount) {
            this.mdiscount_amount = mdiscount_amount;
        }

        public String getDiscount_amount() {
            return discount_amount;
        }

        public void setDiscount_amount(String discount_amount) {
            this.discount_amount = discount_amount;
        }

        public String getBuyer_user_name() {
            return buyer_user_name;
        }

        public void setBuyer_user_name(String buyer_user_name) {
            this.buyer_user_name = buyer_user_name;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getAlipay_sub_merchant_id() {
            return alipay_sub_merchant_id;
        }

        public void setAlipay_sub_merchant_id(String alipay_sub_merchant_id) {
            this.alipay_sub_merchant_id = alipay_sub_merchant_id;
        }

        public String getExt_infos() {
            return ext_infos;
        }

        public void setExt_infos(String ext_infos) {
            this.ext_infos = ext_infos;
        }
    }

    public static class TradeFundBill{
        private String fund_channel;
        private String bank_code;
        private String amount;
        private String real_amount;

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
    }

    public static class TradeSettleInfo{
        private TradeSettleDetail[] trade_settle_detail_list;

        public TradeSettleDetail[] getTrade_settle_detail_list() {
            return trade_settle_detail_list;
        }

        public void setTrade_settle_detail_list(TradeSettleDetail[] trade_settle_detail_list) {
            this.trade_settle_detail_list = trade_settle_detail_list;
        }
    }

    public static class TradeSettleDetail{
        private String operation_type;
        private String operation_serial_no;
        private String operation_dt;
        private String trans_out;
        private String trans_in;
        private String amount;

        public String getOperation_type() {
            return operation_type;
        }

        public void setOperation_type(String operation_type) {
            this.operation_type = operation_type;
        }

        public String getOperation_serial_no() {
            return operation_serial_no;
        }

        public void setOperation_serial_no(String operation_serial_no) {
            this.operation_serial_no = operation_serial_no;
        }

        public String getOperation_dt() {
            return operation_dt;
        }

        public void setOperation_dt(String operation_dt) {
            this.operation_dt = operation_dt;
        }

        public String getTrans_out() {
            return trans_out;
        }

        public void setTrans_out(String trans_out) {
            this.trans_out = trans_out;
        }

        public String getTrans_in() {
            return trans_in;
        }

        public void setTrans_in(String trans_in) {
            this.trans_in = trans_in;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }
    }
}

