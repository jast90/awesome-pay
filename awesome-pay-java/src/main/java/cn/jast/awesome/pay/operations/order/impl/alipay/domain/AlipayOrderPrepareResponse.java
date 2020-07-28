package cn.jast.awesome.pay.operations.order.impl.alipay.domain;

import cn.jast.awesome.pay.domain.alipay.BaseAlipayResponse;

public class AlipayOrderPrepareResponse {

    private Response alipay_trade_precreate_response;

    private String sign;

    public static class Response extends BaseAlipayResponse {
        private String out_trade_no;
        private String qr_code;

        public String getOut_trade_no() {
            return out_trade_no;
        }

        public void setOut_trade_no(String out_trade_no) {
            this.out_trade_no = out_trade_no;
        }

        public String getQr_code() {
            return qr_code;
        }

        public void setQr_code(String qr_code) {
            this.qr_code = qr_code;
        }
    }

    public Response getAlipay_trade_precreate_response() {
        return alipay_trade_precreate_response;
    }

    public void setAlipay_trade_precreate_response(Response alipay_trade_precreate_response) {
        this.alipay_trade_precreate_response = alipay_trade_precreate_response;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
