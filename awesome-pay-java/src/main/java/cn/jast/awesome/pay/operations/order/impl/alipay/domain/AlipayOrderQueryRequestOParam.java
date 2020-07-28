package cn.jast.awesome.pay.operations.order.impl.alipay.domain;

import cn.hutool.json.JSONUtil;
import cn.jast.awesome.pay.domain.alipay.BaseAlipayRequestParam;
import cn.jast.awesome.pay.util.AlipayUtil;

public class AlipayOrderQueryRequestOParam extends BaseAlipayRequestParam {

    public AlipayOrderQueryRequestOParam(BizContent bizContent, String privateKey) {
        this.setMethod("alipay.trade.query");
        this.setBiz_content(JSONUtil.toJsonStr(bizContent));
        this.setSign(AlipayUtil.sign(this,AlipayOrderQueryRequestOParam.class,privateKey));
    }

    public static class BizContent{
        private String out_trade_no;
        private String trade_no;
        private String org_pid;
        private String[] queryOptions;

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

        public String getOrg_pid() {
            return org_pid;
        }

        public void setOrg_pid(String org_pid) {
            this.org_pid = org_pid;
        }

        public String[] getQueryOptions() {
            return queryOptions;
        }

        public void setQueryOptions(String[] queryOptions) {
            this.queryOptions = queryOptions;
        }
    }

}
