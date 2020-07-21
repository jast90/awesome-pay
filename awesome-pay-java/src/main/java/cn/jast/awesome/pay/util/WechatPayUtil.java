package cn.jast.awesome.pay.util;

import cn.jast.awesome.pay.operations.order.impl.wechat.domain.WechatOrderRequestParam;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Map;
import java.util.Random;

public class WechatPayUtil {

    private static final String symbols = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static final Random random = new SecureRandom();

    private WechatPayUtil() {
    }

    /**
     * 获取32个字符的随机字符串 Nonce Str
     *
     * @return
     */
    public static String generateNonceStr() {
        char[] nonceChars = new char[32];
        for (int index = 0; index < nonceChars.length; index++) {
            nonceChars[index] = symbols.charAt(random.nextInt(symbols.length()));
        }
        return new String(nonceChars);
    }

    /**
     * 生成 MD5
     *
     * @param data
     * @return
     * @throws Exception
     */
    public static String md5(String data){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] array = md.digest(data.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte item : array) {
                sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString().toUpperCase();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 生成 HMACSHA256
     *
     * @param data 待处理数据
     * @param key  密钥
     * @return
     * @throws Exception
     */
    public static String HMACSHA256(String data, String key) {
        try {
            Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
            SecretKey secretKey = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
            sha256_HMAC.init(secretKey);
            byte[] array = sha256_HMAC.doFinal(data.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte item : array) {
                sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString().toUpperCase();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 生成签名：MD5加密算法
     * @param t
     * @param clazz
     * @param key
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> String generateSignature(T t, Class<T> clazz, String key)  {
        return generateSignature(t,clazz,key,SignType.MD5);
    }

    /**
     * 生成签名：指定签名加密算法
     * @param t
     * @param clazz
     * @param key
     * @param signType
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> String generateSignature(T t, Class<T> clazz, String key, SignType signType){
        Map<String, String> map = ObjectToMap.objectToMap(t, clazz, true);
        StringBuilder sb = new StringBuilder();
        for (String k : map.keySet()) {
            if ("sign".equals(k)) {
                continue;
            }
            if (map.get(k).trim().length() > 0) {
                sb.append(k).append("=").append(map.get(k).trim()).append("&");
            }
        }
        sb.append("key=").append(key);
        if (signType == SignType.MD5) {
            return md5(sb.toString()).toUpperCase();
        } else if (signType == SignType.HMACSHA256) {
            return HMACSHA256(sb.toString(),key);
        }else{
            throw new IllegalArgumentException(String.format("signType:%s",signType));
        }
    }

    public enum SignType {
        MD5, HMACSHA256
    }

    public static void main(String[] args) throws Exception {
//        System.out.println(generateNonceStr());
//        System.out.println(HMACSHA256("hello", "hello"));

        WechatOrderRequestParam wechatOrderRequestParam = new WechatOrderRequestParam();
        wechatOrderRequestParam.setMch_id("123456");
        System.out.println(generateSignature(wechatOrderRequestParam, WechatOrderRequestParam.class, "123",SignType.HMACSHA256));
    }
}
