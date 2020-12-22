package io.github.jast90.pay.util;

import io.github.jast90.pay.operations.order.impl.wechat.domain.WechatOrderRequestParam;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ObjectUtil {

    public static <T> Map<String, String> objectToMap(T t, Class<T> clazz, boolean filterNull){
        try {
            Map<String, String> map = new TreeMap<>();
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                Object fieldValue = field.get(t);

                if (filterNull) {
                    if (fieldValue != null) {
                        map.put(field.getName(), String.valueOf(fieldValue));
                    }
                } else {
                    map.put(field.getName(), String.valueOf(fieldValue));
                }
            }
            return map;
        }catch (Exception e){
            e.printStackTrace();
        }
        return new HashMap<>();
    }

    public static void main(String[] args) throws Exception {
        WechatOrderRequestParam wechatOrderRequestParam = new WechatOrderRequestParam();
        wechatOrderRequestParam.setMch_id("123456");
        System.out.println(objectToMap(wechatOrderRequestParam, WechatOrderRequestParam.class, true));
    }

}
