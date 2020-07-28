package cn.jast.awesome.pay.https.client;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.client.SimpleClientHttpRequestFactory;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.security.*;
import java.security.cert.CertificateException;

/**
 * 通过RestTemplate发送https请求
 */
public class MySimpleClientHttpsRequestFactory extends SimpleClientHttpRequestFactory {

    private InputStream resource;

    private String key;

    public MySimpleClientHttpsRequestFactory(String filename,String key) {
        this.key = key;
        try {
            resource = new ClassPathResource(filename).getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected HttpURLConnection openConnection(URL url, Proxy proxy) {
        HttpsURLConnection urlConnection = null;
        try {
            char[] password = key.toCharArray();
            KeyStore ks = KeyStore.getInstance("PKCS12");
            ks.load(resource,password);

            KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            kmf.init(ks, password);

            SSLContext sslContext = null;
            sslContext = SSLContext.getInstance("TLS");
            sslContext.init(kmf.getKeyManagers(), null, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
            urlConnection = (HttpsURLConnection) url.openConnection();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (CertificateException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnrecoverableKeyException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
        return urlConnection;
    }
}
