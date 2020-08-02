package cn.jast.awesome.pay.domain.wechat;

import cn.jast.awesome.pay.util.ClassToXml;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;

public class BaseOperationWechatImpl {

    protected String url;

    protected RestTemplate restTemplate;

    public BaseOperationWechatImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    protected <P,R> R doRequest(P p,Class<R> rClass){
        String xml =ClassToXml.objectToXML(p);
        System.out.println("xml:"+xml);
        String responseStr = restTemplate.postForObject(getUrl(),xml ,String.class);
        R r = null;
        try {
            String responseStrUTF8 = new String(responseStr.getBytes("UTF-8"),"UTF-8");
            r = ClassToXml.xmlToObject(responseStrUTF8,rClass);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return r;
    }

    protected <P,R> R doRequestISO88591(P p,Class<R> rClass){
        String xml =ClassToXml.objectToXML(p);
        System.out.println("xml:"+xml);
        String responseStr = restTemplate.postForObject(getUrl(),xml ,String.class);
        R r = null;
        try {
            String responseStrUTF8 = new String(responseStr.getBytes("ISO-8859-1"),"UTF-8");
            r = ClassToXml.xmlToObject(responseStrUTF8,rClass);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return r;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
