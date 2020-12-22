package io.github.jast90.pay.util;

import io.github.jast90.pay.operations.order.impl.wechat.domain.WechatOrderRequestParam;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

public class ClassToXml {

    private static XStream xStream = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("_-", "_")));

    public static String objectToXML(Object object){
        xStream.processAnnotations(object.getClass());
        return xStream.toXML(object);
    }

    public static  <T> T xmlToObject(String xml,Class<T> clazz){
        xStream.processAnnotations(clazz);
        return (T) xStream.fromXML(xml);
    }


    public static void main(String[] args) {
        WechatOrderRequestParam wechatOrderRequestParam = new WechatOrderRequestParam();
        wechatOrderRequestParam.setAppid("123");
        wechatOrderRequestParam.setMch_id("123");
        System.out.println(objectToXML(wechatOrderRequestParam));
    }
}
