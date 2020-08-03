package cn.jast.awesome.pay;

import cn.jast.awesome.pay.https.client.MySimpleClientHttpsRequestFactory;
import cn.jast.awesome.pay.operations.bill.BillQueryOperation;
import cn.jast.awesome.pay.operations.bill.impl.wechat.BillQueryOperationWechatImpl;
import cn.jast.awesome.pay.operations.bill.impl.wechat.domain.WechatBillQueryRequestParam;
import cn.jast.awesome.pay.operations.bill.impl.wechat.domain.WechatBillQueryResponse;
import cn.jast.awesome.pay.operations.order.*;
import cn.jast.awesome.pay.operations.order.impl.wechat.*;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.*;
import cn.jast.awesome.pay.operations.profitsharing.*;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.*;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.*;
import cn.jast.awesome.pay.operations.redpack.RedPackGetInfoOperation;
import cn.jast.awesome.pay.operations.redpack.SendGroupRedPackOperation;
import cn.jast.awesome.pay.operations.redpack.SendMiniProgramRedPackOperation;
import cn.jast.awesome.pay.operations.redpack.SendRedpackOperation;
import cn.jast.awesome.pay.operations.redpack.doman.wechat.*;
import cn.jast.awesome.pay.operations.redpack.impl.wechat.RedPackGetInfoOperationWechatImpl;
import cn.jast.awesome.pay.operations.redpack.impl.wechat.SendGroupRedPackOperationWechatImpl;
import cn.jast.awesome.pay.operations.redpack.impl.wechat.SendMiniProgramRedPackOperationWechatImpl;
import cn.jast.awesome.pay.operations.redpack.impl.wechat.SendRedPackOperationWechatImpl;
import cn.jast.awesome.pay.operations.transfer.*;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.*;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.*;
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
            throw new IllegalArgumentException("需要相关证书");
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
            throw new IllegalArgumentException("需要相关证书");
        }
        return new ProfitSharingOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public MultiProfitSharingOperation<MultiProfitSharingRequestParam, MultiProfitSharingResponse> opsForMultiProfitSharing() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new MultiProfitSharingOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public ProfitSharingQueryOperation<ProfitSharingQueryRequestParam, ProfitSharingQueryResponse> opsForProfitSharingQuery() {
        return new ProfitSharingQueryOperationWechatImpl(restTemplate);
    }

    @Override
    public ProfitSharingFinishOperation<ProfitSharingFinishRequestParam, ProfitSharingFinishResponse> opsForProfitSharingFinish() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new ProfitSharingFinishOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public ProfitSharingReturnOperation<ProfitSharingReturnRequestParam, ProfitSharingReturnResponse> opsForProfitSharingReturn() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new ProfitSharingReturnOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public ProfitSharingReturnQueryOperation<ProfitSharingReturnQueryRequestParam, ProfitSharingReturnQueryResponse> opsForProfitSharingReturnQuery() {
        return new ProfitSharingReturnQueryOperationWechatImpl(restTemplate);
    }

    @Override
    public TransferOperation<TransferWechatRequestParam, TransferWechatResponse> opsForTransferOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new TransferOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public TransferInfoGetOperation<TransferInfoGetRequest, TransferInfoGetResponse> opsForTransferInfoGetOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new TransferInfoGetOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public PublicKeyGetOperation<PublicKeyGetRequest, PublicKeyGetResponse> opsForPublicKeyGetOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new PublicKeyGetOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public PayBankOperation<PayBankRequest, PayBankResponse> opsForPayBankOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new PayBankOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public PayBankQueryOperation<PayBankQueryRequest, PayBankQueryResponse> opsForPayBankQueryOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new PayBankQueryOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public SendRedpackOperation<SendRedPackRequest, SendRedPackResponse> opsForSendRedpackOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new SendRedPackOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public SendGroupRedPackOperation<SendGroupRedPackRequest, SendGroupRedPackResponse> opsForSendGroupRedPackOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new SendGroupRedPackOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public SendMiniProgramRedPackOperation<SendMiniProgramRedPackRequest, SendMiniProgramRedPackResponse> opsForSendMiniProgramRedPackOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new SendMiniProgramRedPackOperationWechatImpl(sslRestTemplate);
    }

    @Override
    public RedPackGetInfoOperation<RedPackGetInfoRequest, RedPackGetInfoResponse> opsForRedPackGetInfoOperation() {
        if(sslRestTemplate == null){
            throw new IllegalArgumentException("需要相关证书");
        }
        return new RedPackGetInfoOperationWechatImpl(sslRestTemplate);
    }
}
