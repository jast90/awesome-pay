package cn.jast.awesome.pay.util;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.Sign;
import cn.hutool.crypto.asymmetric.SignAlgorithm;

import java.util.Base64;
import java.util.Map;

public class AlipayUtil {

    /**
     * TODO 待验证
     * @param t 待签名参数
     * @param clazz
     * @param privateKey 应用私钥
     * @param <T>
     * @return
     */
    public static <T> String sign(T t,Class<T> clazz,String privateKey){
        Sign sign = SecureUtil.sign(SignAlgorithm.SHA256withRSA,privateKey.getBytes(),null);
        Map<String,String> map = ObjectUtil.objectToMap(t,clazz,true);
        StringBuilder sb = new StringBuilder();
        for (String k : map.keySet()) {
            if ("sign".equals(k)) {
                continue;
            }
            if (map.get(k).trim().length() > 0) {
                sb.append(k).append("=").append(map.get(k).trim()).append("&");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return Base64.getEncoder().encodeToString(sign.sign(sb.toString().getBytes()));
    }
}