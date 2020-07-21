package cn.jast.awesome.pay.domain.wechat;

import cn.jast.awesome.pay.util.WechatPayUtil;

public class BaseWechatRequestParam {
    protected String appid;

    protected String mch_id;

    protected String sign;

    protected String nonce_str;

    protected String sign_type;

    /**
     * 设置签名（设置完属性后调用一次）
     *
     * @param key
     * @param t
     * @param clazz
     * @param signType
     * @param <T>
     */
    public <T> void setSign(String key, T t , Class<T> clazz, WechatPayUtil.SignType signType){
        String sign = WechatPayUtil.generateSignature(t,clazz,key,signType);
        this.setSign(sign);
    }

    /**
     * 随机字符串（设置完属性后调用一次）
     * @param <T>
     */
    public <T> void setNonceStr(){
        this.setNonce_str(WechatPayUtil.generateNonceStr());
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }
}
