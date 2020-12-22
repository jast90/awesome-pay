package io.github.jast90.pay.operations.order.impl.alipay.domain;

import cn.hutool.json.JSONUtil;
import io.github.jast90.pay.domain.alipay.BaseAlipayRequestParam;
import io.github.jast90.pay.util.AlipayUtil;

public class AlipayOrderRefundRequestParam extends BaseAlipayRequestParam {

    public AlipayOrderRefundRequestParam(BizContent bizContent,String privateKey) {
        this.setMethod("alipay.trade.refund");
        this.setBiz_content(JSONUtil.toJsonStr(bizContent));
        this.setSign(AlipayUtil.sign(this,AlipayOrderRefundRequestParam.class,privateKey));
    }

    public static class BizContent{
        private String out_trade_no;
        private String trade_no;
        private String refund_amount;
        private String refund_currency;
        private String refund_reason;
        private String out_request_no;
        private String operator_id;
        private String store_id;
        private String terminal_id;
        private GoodsDetail[] goods_detail;
        private OpenApiRoyaltyDetailInfoPojo[] refund_royalty_parameters;
        private String org_pid;
        private String[] query_options;

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }

        public String getTrade_no() {
            return trade_no;
        }

        public void setTrade_no(String trade_no) {
            this.trade_no = trade_no;
        }

        public String getRefund_amount() {
            return refund_amount;
        }

        public void setRefund_amount(String refund_amount) {
            this.refund_amount = refund_amount;
        }

        public String getRefund_currency() {
            return refund_currency;
        }

        public void setRefund_currency(String refund_currency) {
            this.refund_currency = refund_currency;
        }

        public String getRefund_reason() {
            return refund_reason;
        }

        public void setRefund_reason(String refund_reason) {
            this.refund_reason = refund_reason;
        }

        public String getOut_request_no() {
            return out_request_no;
        }

        public void setOut_request_no(String out_request_no) {
            this.out_request_no = out_request_no;
        }

        public String getOperator_id() {
            return operator_id;
        }

        public void setOperator_id(String operator_id) {
            this.operator_id = operator_id;
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

        public GoodsDetail[] getGoods_detail() {
            return goods_detail;
        }

        public void setGoods_detail(GoodsDetail[] goods_detail) {
            this.goods_detail = goods_detail;
        }

        public OpenApiRoyaltyDetailInfoPojo[] getRefund_royalty_parameters() {
            return refund_royalty_parameters;
        }

        public void setRefund_royalty_parameters(OpenApiRoyaltyDetailInfoPojo[] refund_royalty_parameters) {
            this.refund_royalty_parameters = refund_royalty_parameters;
        }

        public String getOrg_pid() {
            return org_pid;
        }

        public void setOrg_pid(String org_pid) {
            this.org_pid = org_pid;
        }

        public String[] getQuery_options() {
            return query_options;
        }

        public void setQuery_options(String[] query_options) {
            this.query_options = query_options;
        }
    }

    public static class GoodsDetail{
        private String goods_id;
        private String alipay_goods_id;
        private String goods_name;
        private String quantity;
        private String price;
        private String goods_category;
        private String categories_tree;
        private String body;
        private String show_url;

        public String getGoods_id() {
            return goods_id;
        }

        public void setGoods_id(String goods_id) {
            this.goods_id = goods_id;
        }

        public String getAlipay_goods_id() {
            return alipay_goods_id;
        }

        public void setAlipay_goods_id(String alipay_goods_id) {
            this.alipay_goods_id = alipay_goods_id;
        }

        public String getGoods_name() {
            return goods_name;
        }

        public void setGoods_name(String goods_name) {
            this.goods_name = goods_name;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getGoods_category() {
            return goods_category;
        }

        public void setGoods_category(String goods_category) {
            this.goods_category = goods_category;
        }

        public String getCategories_tree() {
            return categories_tree;
        }

        public void setCategories_tree(String categories_tree) {
            this.categories_tree = categories_tree;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getShow_url() {
            return show_url;
        }

        public void setShow_url(String show_url) {
            this.show_url = show_url;
        }
    }

    public static class OpenApiRoyaltyDetailInfoPojo{
        private String royalty_type;
        private String trans_out;
        private String trans_out_type;
        private String trans_in_type;
        private String trans_in;
        private String amount;
        private String amount_percentage;
        private String desc;
    }

}
