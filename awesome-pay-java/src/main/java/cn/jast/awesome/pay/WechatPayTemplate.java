package cn.jast.awesome.pay;

import cn.jast.awesome.pay.https.client.MySimpleClientHttpsRequestFactory;
import cn.jast.awesome.pay.operations.bill.BillQueryOperation;
import cn.jast.awesome.pay.operations.bill.impl.wechat.BillQueryOperationWechatImpl;
import cn.jast.awesome.pay.operations.bill.impl.wechat.domain.WechatBillQueryRequestParam;
import cn.jast.awesome.pay.operations.bill.impl.wechat.domain.WechatBillQueryResponse;
import cn.jast.awesome.pay.operations.order.*;
import cn.jast.awesome.pay.operations.order.impl.wechat.*;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.*;
import cn.jast.awesome.pay.operations.profitsharing.MultiProfitSharingOperation;
import cn.jast.awesome.pay.operations.profitsharing.ProfitSharingAddReceiverOperation;
import cn.jast.awesome.pay.operations.profitsharing.ProfitSharingOperation;
import cn.jast.awesome.pay.operations.profitsharing.ProfitSharingRemoveReceiverOperation;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.MultiProfitSharingOperationWechatImpl;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.ProfitSharingAddReceiverOperationWechatImpl;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.ProfitSharingOperationWechatImpl;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.ProfitSharingRemoveReceiverOperationWechatImpl;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.*;
import org.springframework.web.client.RestTemplate;

public class WechatPayTemplate implements WechatPayOperations {

    private RestTemplate restTemplate;

    private RestTemplate sslRestTemplate;

    private String p12URI;

    private String mchId;

    public WechatPayTemplate() {
        restTemplate = new RestTemplate();
    }

    /**
     *
     * @param p12URI classpath环境下的.p12文件
     * @param mchId
     */
    public WechatPayTemplate(String p12URI,String mchId) {
        this();
        this.p12URI = p12URI;
        this.mchId = mchId;
        sslRestTemplate = new RestTemplate(new MySimpleClientHttpsRequestFactory(p12URI,mchId));
    }

    @Override
    public OrderOperation<WechatOrderRequestParam, WechatOrderResponse> opsForOrder() {
        return new OrderOperationWechatImpl(restTemplate);
    }

    @Override
    public OrderPrepareOperation<WechatOrderRequestParam, WechatOrderResponse> opsForOrderPrepare() {
        return new OrderPrepareOperationWechatImpl(restTemplate);
    }

    @Override
    public OrderQueryOperation<WechatOrderQueryRequestParam, WechatOrderQueryResponse> opsForOrderQuery() {
        return new OrderQueryOperationWechatImpl(restTemplate);
    }

    @Override
    public OrderRefundOperation<WechatOrderRefundRequestParam, WechatOrderRefundResponse> opsForOrderRefund() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("微信退款需要相关证书");
        }
        return new OrderRefundOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public OrderRefundQueryOperation<WechatOrderRefundQueryRequestParam, WechatOrderRefundQueryResponse> opsForOrderRefundQuery() {
        return new OrderRefundQueryOperationWechatImpl(restTemplate);
    }

    @Override
    public OrderCloseOperation<WechatOrderCloseRequestParam, WechatOrderCloseResponse> opsForOrderClose() {
        return new OrderCloseOperationWechatImpl(restTemplate);
    }

    @Override
    public BillQueryOperation<WechatBillQueryRequestParam, WechatBillQueryResponse> opsForBillQuery() {
        return new BillQueryOperationWechatImpl(restTemplate);
    }

    @Override
    public ProfitSharingAddReceiverOperation<ProfitSharingAddReceiverRequestParam, ProfitSharingAddReceiverResponse> opsForProfitSharingAddReceiver() {
        return new ProfitSharingAddReceiverOperationWechatImpl(restTemplate);
    }

    @Override
    public ProfitSharingRemoveReceiverOperation<ProfitSharingRemoveReceiverRequestParam, ProfitSharingRemoveReceiverResponse> opsForProfitSharingRemoveReceiver() {
        return new ProfitSharingRemoveReceiverOperationWechatImpl(restTemplate);
    }

    @Override
    public ProfitSharingOperation<ProfitSharingRequestParam, ProfitSharingResponse> opsForProfitSharingOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("微信退款需要相关证书");
        }
        return new ProfitSharingOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public MultiProfitSharingOperation<MultiProfitSharingRequestParam, MultiProfitSharingResponse> opsForMultiProfitSharing() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("微信退款需要相关证书");
        }
        return new MultiProfitSharingOperationWechatImpl(sslRestTemplate);
    }
}
