package io.github.jast90.pay;

import io.github.jast90.pay.https.client.MySimpleClientHttpsRequestFactory;
import io.github.jast90.pay.operations.WechatOperation;
import io.github.jast90.pay.operations.bill.impl.wechat.BillQueryOperationWechatImpl;
import io.github.jast90.pay.operations.bill.impl.wechat.domain.WechatBillQueryRequestParam;
import io.github.jast90.pay.operations.bill.impl.wechat.domain.WechatBillQueryResponse;
import io.github.jast90.pay.operations.order.impl.wechat.*;
import io.github.jast90.pay.operations.order.impl.wechat.domain.*;
import io.github.jast90.pay.operations.profitsharing.impl.wechat.*;
import io.github.jast90.pay.operations.profitsharing.impl.wechat.domain.*;
import io.github.jast90.pay.operations.redpack.impl.wechat.RedPackGetInfoOperationWechatImpl;
import io.github.jast90.pay.operations.redpack.impl.wechat.SendGroupRedPackOperationWechatImpl;
import io.github.jast90.pay.operations.redpack.impl.wechat.SendMiniProgramRedPackOperationWechatImpl;
import io.github.jast90.pay.operations.redpack.impl.wechat.SendRedPackOperationWechatImpl;
import io.github.jast90.pay.operations.redpack.impl.wechat.domain.*;
import io.github.jast90.pay.operations.transfer.impl.wechat.*;
import io.github.jast90.pay.operations.transfer.impl.wechat.domain.*;
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
    public WechatOperation<WechatOrderRequestParam, WechatOrderResponse> opsForOrder() {
        return new OrderOperationWechatImpl(restTemplate);
    }

    @Override
    public WechatOperation<WechatOrderRequestParam, WechatOrderResponse> opsForOrderPrepare() {
        return new OrderPrepareOperationWechatImpl(restTemplate);
    }

    @Override
    public WechatOperation<WechatOrderQueryRequestParam, WechatOrderQueryResponse> opsForOrderQuery() {
        return new OrderQueryOperationWechatImpl(restTemplate);
    }

    @Override
    public WechatOperation<WechatOrderRefundRequestParam, WechatOrderRefundResponse> opsForOrderRefund() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new OrderRefundOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public WechatOperation<WechatOrderRefundQueryRequestParam, WechatOrderRefundQueryResponse> opsForOrderRefundQuery() {
        return new OrderRefundQueryOperationWechatImpl(restTemplate);
    }

    @Override
    public WechatOperation<WechatOrderCloseRequestParam, WechatOrderCloseResponse> opsForOrderClose() {
        return new OrderCloseOperationWechatImpl(restTemplate);
    }

    @Override
    public WechatOperation<WechatBillQueryRequestParam, WechatBillQueryResponse> opsForBillQuery() {
        return new BillQueryOperationWechatImpl(restTemplate);
    }

    @Override
    public WechatOperation<ProfitSharingAddReceiverRequestParam, ProfitSharingAddReceiverResponse> opsForProfitSharingAddReceiver() {
        return new ProfitSharingAddReceiverOperationWechatImpl(restTemplate);
    }

    @Override
    public WechatOperation<ProfitSharingRemoveReceiverRequestParam, ProfitSharingRemoveReceiverResponse> opsForProfitSharingRemoveReceiver() {
        return new ProfitSharingRemoveReceiverOperationWechatImpl(restTemplate);
    }

    @Override
    public WechatOperation<ProfitSharingRequestParam, ProfitSharingResponse> opsForProfitSharingOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new ProfitSharingOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public WechatOperation<MultiProfitSharingRequestParam, MultiProfitSharingResponse> opsForMultiProfitSharing() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new MultiProfitSharingOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public WechatOperation<ProfitSharingQueryRequestParam, ProfitSharingQueryResponse> opsForProfitSharingQuery() {
        return new ProfitSharingQueryOperationWechatImpl(restTemplate);
    }

    @Override
    public WechatOperation<ProfitSharingFinishRequestParam, ProfitSharingFinishResponse> opsForProfitSharingFinish() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new ProfitSharingFinishOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public WechatOperation<ProfitSharingReturnRequestParam, ProfitSharingReturnResponse> opsForProfitSharingReturn() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new ProfitSharingReturnOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public WechatOperation<ProfitSharingReturnQueryRequestParam, ProfitSharingReturnQueryResponse> opsForProfitSharingReturnQuery() {
        return new ProfitSharingReturnQueryOperationWechatImpl(restTemplate);
    }

    @Override
    public WechatOperation<TransferWechatRequestParam, TransferWechatResponse> opsForTransferOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new TransferOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public WechatOperation<TransferInfoGetRequest, TransferInfoGetResponse> opsForTransferInfoGetOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new TransferInfoGetOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public WechatOperation<PublicKeyGetRequest, PublicKeyGetResponse> opsForPublicKeyGetOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new PublicKeyGetOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public WechatOperation<PayBankRequest, PayBankResponse> opsForPayBankOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new PayBankOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public WechatOperation<PayBankQueryRequest, PayBankQueryResponse> opsForPayBankQueryOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new PayBankQueryOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public WechatOperation<SendRedPackRequest, SendRedPackResponse> opsForSendRedpackOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new SendRedPackOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public WechatOperation<SendGroupRedPackRequest, SendGroupRedPackResponse> opsForSendGroupRedPackOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new SendGroupRedPackOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public WechatOperation<SendMiniProgramRedPackRequest, SendMiniProgramRedPackResponse> opsForSendMiniProgramRedPackOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new SendMiniProgramRedPackOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public WechatOperation<RedPackGetInfoRequest, RedPackGetInfoResponse> opsForRedPackGetInfoOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new RedPackGetInfoOperationWechatImpl(sslRestTemplate);
    }
}
