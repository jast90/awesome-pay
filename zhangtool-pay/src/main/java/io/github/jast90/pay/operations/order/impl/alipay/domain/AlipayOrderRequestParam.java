package io.github.jast90.pay.operations.order.impl.alipay.domain;

import cn.hutool.json.JSONUtil;
import io.github.jast90.pay.domain.alipay.BaseAlipayRequestParam;
import io.github.jast90.pay.util.AlipayUtil;

import java.math.BigDecimal;

/**
 * <a href="https://opendocs.alipay.com/apis/api_1/alipay.trade.create">alipay.trade.create(统一收单交易创建接口)</a>
 */
public class AlipayOrderRequestParam extends BaseAlipayRequestParam {

    public AlipayOrderRequestParam(BizContent bizContent,String privateKey) {
        this.setMethod("alipay.trade.create");
        this.setBiz_content(JSONUtil.toJsonStr(bizContent));
        this.setSign(AlipayUtil.sign(this,AlipayOrderRequestParam.class,privateKey));
    }



    public static class BizContent {
        private String out_trade_no;
        private String seller_id;
        private BigDecimal total_amount;
        private BigDecimal discountable_amount;
        private String subject;
        private String body;
        private String buyer_id;
        public GoodsDetail goodsDetail;
        private String product_code;
        private String operator_id;
        private String store_id;
        private String terminal_id;
        private ExtendParams extend_params;
        private String timeout_express;
        private SettleInfo settle_info;
        private LogisticsDetail logisticsDetail;
        private BusinessParams business_params;

        private ReceiverAddressInfo receiver_address_info;

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

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getBuyer_id() {
            return buyer_id;
        }

        public void setBuyer_id(String buyer_id) {
            this.buyer_id = buyer_id;
        }

        public GoodsDetail getGoodsDetail() {
            return goodsDetail;
        }

        public void setGoodsDetail(GoodsDetail goodsDetail) {
            this.goodsDetail = goodsDetail;
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

        public String getTerminal_id() {
            return terminal_id;
        }

        public void setTerminal_id(String terminal_id) {
            this.terminal_id = terminal_id;
        }

        public ExtendParams getExtend_params() {
            return extend_params;
        }

        public void setExtend_params(ExtendParams extend_params) {
            this.extend_params = extend_params;
        }

        public String getTimeout_express() {
            return timeout_express;
        }

        public void setTimeout_express(String timeout_express) {
            this.timeout_express = timeout_express;
        }

        public SettleInfo getSettle_info() {
            return settle_info;
        }

        public void setSettle_info(SettleInfo settle_info) {
            this.settle_info = settle_info;
        }

        public LogisticsDetail getLogisticsDetail() {
            return logisticsDetail;
        }

        public void setLogisticsDetail(LogisticsDetail logisticsDetail) {
            this.logisticsDetail = logisticsDetail;
        }

        public BusinessParams getBusiness_params() {
            return business_params;
        }

        public void setBusiness_params(BusinessParams business_params) {
            this.business_params = business_params;
        }

        public ReceiverAddressInfo getReceiver_address_info() {
            return receiver_address_info;
        }

        public void setReceiver_address_info(ReceiverAddressInfo receiver_address_info) {
            this.receiver_address_info = receiver_address_info;
        }
    }

    public static class GoodsDetail {
        private String good_id;
        private String goods_name;
        private int quantity;
        private BigDecimal price;
        private String goods_category;
        private String categories_tree;
        private String body;
        private String show_url;

        public String getGood_id() {
            return good_id;
        }

        public void setGood_id(String good_id) {
            this.good_id = good_id;
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

    public static class ExtendParams {
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

    public static class SettleInfo {
        private SettleDetailInfo settle_detail_infos;
        private String settle_period_time;

        public SettleDetailInfo getSettle_detail_infos() {
            return settle_detail_infos;
        }

        public void setSettle_detail_infos(SettleDetailInfo settle_detail_infos) {
            this.settle_detail_infos = settle_detail_infos;
        }

        public String getSettle_period_time() {
            return settle_period_time;
        }

        public void setSettle_period_time(String settle_period_time) {
            this.settle_period_time = settle_period_time;
        }
    }

    public static class SettleDetailInfo {
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

    public static class LogisticsDetail {
        private String logistics_type;

        public String getLogistics_type() {
            return logistics_type;
        }

        public void setLogistics_type(String logistics_type) {
            this.logistics_type = logistics_type;
        }
    }

    public static class BusinessParams {
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

    public static class ReceiverAddressInfo {
        private String name;
        private String address;
        private String mobile;
        private String zip;
        private String division_code;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }

        public String getDivision_code() {
            return division_code;
        }

        public void setDivision_code(String division_code) {
            this.division_code = division_code;
        }
    }


}
