package cn.jast.awesome.pay.operations.order.impl.alipay.domain;

import cn.hutool.json.JSONUtil;
import cn.jast.awesome.pay.domain.alipay.BaseAlipayRequestParam;
import cn.jast.awesome.pay.util.AlipayUtil;

import java.math.BigDecimal;

public class AlipayOrderPrepareRequestParam extends BaseAlipayRequestParam {

    public AlipayOrderPrepareRequestParam(BizContent bizContent, String privateKey) {
        this.setMethod("alipay.trade.precreate");
        this.setBiz_content(JSONUtil.toJsonStr(bizContent));
        this.setSign(AlipayUtil.sign(this,AlipayOrderPrepareRequestParam.class,privateKey));
    }

    public static class BizContent{
        private String out_trade_no;
        private String seller_id;
        private BigDecimal total_amount;
        private BigDecimal discountable_amount;
        private String subject;
        private GoodsDetail goodsDetail;
        private String body;
        private String product_code;
        private String operator_id;
        private String store_id;
        private String disable_pay_channels;
        private String enable_pay_channels;
        private String terminal_id;
        private ExtendParams extendParams;
        private String timeout_express;
        private SettleInfo settleInfo;
        private String merchant_order_no;
        private BusinessParams businessParams;
        private String qr_code_timeout_express;

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }

        public String getSeller_id() {
            return seller_id;
        }

        public void setSeller_id(String seller_id) {
            this.seller_id = seller_id;
        }

        public BigDecimal getTotal_amount() {
            return total_amount;
        }

        public void setTotal_amount(BigDecimal total_amount) {
            this.total_amount = total_amount;
        }

        public BigDecimal getDiscountable_amount() {
            return discountable_amount;
        }

        public void setDiscountable_amount(BigDecimal discountable_amount) {
            this.discountable_amount = discountable_amount;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public GoodsDetail getGoodsDetail() {
            return goodsDetail;
        }

        public void setGoodsDetail(GoodsDetail goodsDetail) {
            this.goodsDetail = goodsDetail;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getProduct_code() {
            return product_code;
        }

        public void setProduct_code(String product_code) {
            this.product_code = product_code;
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

        public String getDisable_pay_channels() {
            return disable_pay_channels;
        }

        public void setDisable_pay_channels(String disable_pay_channels) {
            this.disable_pay_channels = disable_pay_channels;
        }

        public String getEnable_pay_channels() {
            return enable_pay_channels;
        }

        public void setEnable_pay_channels(String enable_pay_channels) {
            this.enable_pay_channels = enable_pay_channels;
        }

        public String getTerminal_id() {
            return terminal_id;
        }

        public void setTerminal_id(String terminal_id) {
            this.terminal_id = terminal_id;
        }

        public ExtendParams getExtendParams() {
            return extendParams;
        }

        public void setExtendParams(ExtendParams extendParams) {
            this.extendParams = extendParams;
        }

        public String getTimeout_express() {
            return timeout_express;
        }

        public void setTimeout_express(String timeout_express) {
            this.timeout_express = timeout_express;
        }

        public SettleInfo getSettleInfo() {
            return settleInfo;
        }

        public void setSettleInfo(SettleInfo settleInfo) {
            this.settleInfo = settleInfo;
        }

        public String getMerchant_order_no() {
            return merchant_order_no;
        }

        public void setMerchant_order_no(String merchant_order_no) {
            this.merchant_order_no = merchant_order_no;
        }

        public BusinessParams getBusinessParams() {
            return businessParams;
        }

        public void setBusinessParams(BusinessParams businessParams) {
            this.businessParams = businessParams;
        }

        public String getQr_code_timeout_express() {
            return qr_code_timeout_express;
        }

        public void setQr_code_timeout_express(String qr_code_timeout_express) {
            this.qr_code_timeout_express = qr_code_timeout_express;
        }
    }

    public static class GoodsDetail{
        private String goods_id;
        private String goods_name;
        private int quantity;
        private BigDecimal price;
        private String goods_category;
        private String categoies_tree;
        private String body;
        private String show_url;

        public String getGoods_id() {
            return goods_id;
        }

        public void setGoods_id(String goods_id) {
            this.goods_id = goods_id;
        }

        public String getGoods_name() {
            return goods_name;
        }

        public void setGoods_name(String goods_name) {
            this.goods_name = goods_name;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public String getGoods_category() {
            return goods_category;
        }

        public void setGoods_category(String goods_category) {
            this.goods_category = goods_category;
        }

        public String getCategoies_tree() {
            return categoies_tree;
        }

        public void setCategoies_tree(String categoies_tree) {
            this.categoies_tree = categoies_tree;
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

    public static class ExtendParams{
        private String sys_service_provider_id;
        private String card_type;

        public String getSys_service_provider_id() {
            return sys_service_provider_id;
        }

        public void setSys_service_provider_id(String sys_service_provider_id) {
            this.sys_service_provider_id = sys_service_provider_id;
        }

        public String getCard_type() {
            return card_type;
        }

        public void setCard_type(String card_type) {
            this.card_type = card_type;
        }
    }

    public static class SettleInfo{
        private SettleDetailInfos settleDetailInfos;

        public SettleDetailInfos getSettleDetailInfos() {
            return settleDetailInfos;
        }

        public void setSettleDetailInfos(SettleDetailInfos settleDetailInfos) {
            this.settleDetailInfos = settleDetailInfos;
        }
    }

    public static class SettleDetailInfos{
        private String trans_in_type;
        private String trans_in;
        private String summary_dimension;
        private String settle_entity_id;
        private String settle_entity_type;
        private BigDecimal amount;

        public String getTrans_in_type() {
            return trans_in_type;
        }

        public void setTrans_in_type(String trans_in_type) {
            this.trans_in_type = trans_in_type;
        }

        public String getTrans_in() {
            return trans_in;
        }

        public void setTrans_in(String trans_in) {
            this.trans_in = trans_in;
        }

        public String getSummary_dimension() {
            return summary_dimension;
        }

        public void setSummary_dimension(String summary_dimension) {
            this.summary_dimension = summary_dimension;
        }

        public String getSettle_entity_id() {
            return settle_entity_id;
        }

        public void setSettle_entity_id(String settle_entity_id) {
            this.settle_entity_id = settle_entity_id;
        }

        public String getSettle_entity_type() {
            return settle_entity_type;
        }

        public void setSettle_entity_type(String settle_entity_type) {
            this.settle_entity_type = settle_entity_type;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }
    }

    public static class BusinessParams{
        private String campus_card;
        private String card_type;
        private String actual_order_time;

        public String getCampus_card() {
            return campus_card;
        }

        public void setCampus_card(String campus_card) {
            this.campus_card = campus_card;
        }

        public String getCard_type() {
            return card_type;
        }

        public void setCard_type(String card_type) {
            this.card_type = card_type;
        }

        public String getActual_order_time() {
            return actual_order_time;
        }

        public void setActual_order_time(String actual_order_time) {
            this.actual_order_time = actual_order_time;
        }
    }
}
