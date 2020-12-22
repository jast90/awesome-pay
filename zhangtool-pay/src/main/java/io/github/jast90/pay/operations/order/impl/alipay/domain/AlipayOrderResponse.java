package io.github.jast90.pay.operations.order.impl.alipay.domain;

import io.github.jast90.pay.domain.alipay.BaseAlipayResponse;

/**
 * <a href="https://opendocs.alipay.com/apis/api_1/alipay.trade.create#%E5%93%8D%E5%BA%94%E5%8F%82%E6%95%B0">alipay.trade.create(统一收单交易创建接口)</a>
 */
public class AlipayOrderResponse {

    private Response alipay_trade_create_response;
    private String sign;

    public static class Response extends BaseAlipayResponse {
        private String out_trade_no;
        private String trade_no;

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
    }

    public Response getAlipay_trade_create_response() {
        return alipay_trade_create_response;
    }

    public void setAlipay_trade_create_response(Response alipay_trade_create_response) {
        this.alipay_trade_create_response = alipay_trade_create_response;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
