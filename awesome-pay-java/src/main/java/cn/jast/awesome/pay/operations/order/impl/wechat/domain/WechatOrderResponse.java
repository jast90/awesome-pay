package cn.jast.awesome.pay.operations.order.impl.wechat.domain;

import cn.jast.awesome.pay.domain.wechat.BaseWechatResponse;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class WechatOrderResponse extends BaseWechatResponse {

    private String device_info;
    private String trade_type;
    private String prepay_id;
    private String code_url;

    public String getDevice_info() {
        return device_info;
    }

    public void setDevice_info(String device_info) {
        this.device_info = device_info;
    }

    public String getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(String trade_type) {
        this.trade_type = trade_type;
    }

    public String getPrepay_id() {
        return prepay_id;
    }

    public void setPrepay_id(String prepay_id) {
        this.prepay_id = prepay_id;
    }

    public String getCode_url() {
        return code_url;
    }

    public void setCode_url(String code_url) {
        this.code_url = code_url;
    }

    @Override
    public String toString() {
        return "WechatOrderResponse{" +
                "return_code='" + getResult_code() + '\'' +
                ", return_msg='" + getReturn_msg() + '\'' +
                ", appid='" + getAppid() + '\'' +
                ", mch_id='" + getMch_id() + '\'' +
                ", device_info='" + device_info + '\'' +
                ", nonce_str='" + getNonce_str() + '\'' +
                ", sign='" + getSign() + '\'' +
                ", result_code='" + getResult_code() + '\'' +
                ", err_code='" + getErr_code() + '\'' +
                ", err_code_desc='" + getErr_code_desc() + '\'' +
                ", trade_type='" + trade_type + '\'' +
                ", prepay_id='" + prepay_id + '\'' +
                ", code_url='" + code_url + '\'' +
                '}';
    }
}
