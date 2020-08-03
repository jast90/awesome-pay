package cn.jast.awesome.pay;


import cn.jast.awesome.pay.operations.bill.BillQueryOperation;
import cn.jast.awesome.pay.operations.bill.impl.wechat.domain.WechatBillQueryRequestParam;
import cn.jast.awesome.pay.operations.bill.impl.wechat.domain.WechatBillQueryResponse;
import cn.jast.awesome.pay.operations.order.*;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.*;
import cn.jast.awesome.pay.operations.profitsharing.*;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.*;
import cn.jast.awesome.pay.operations.redpack.RedPackGetInfoOperation;
import cn.jast.awesome.pay.operations.redpack.SendGroupRedPackOperation;
import cn.jast.awesome.pay.operations.redpack.SendMiniProgramRedPackOperation;
import cn.jast.awesome.pay.operations.redpack.SendRedpackOperation;
import cn.jast.awesome.pay.operations.redpack.doman.wechat.*;
import cn.jast.awesome.pay.operations.transfer.*;
import cn.jast.awesome.pay.operations.transfer.impl.wechat.domain.*;

public interface WechatPayOperations {

    /**
     * 统一下单
     *
     * @return
     */
    OrderOperation<WechatOrderRequestParam, WechatOrderResponse> opsForOrder();

    /**
     * 统一下单（预下单）
     * @return
     */
    OrderPrepareOperation<WechatOrderRequestParam, WechatOrderResponse> opsForOrderPrepare();

    /**
     * 查询订单
     * @return
     */
    OrderQueryOperation<WechatOrderQueryRequestParam, WechatOrderQueryResponse>  opsForOrderQuery();

    /**
     * 申请退款（需要证书）
     * @return
     */
    OrderRefundOperation<WechatOrderRefundRequestParam, WechatOrderRefundResponse> opsForOrderRefund();

    /**
     * 查询退款
     * @return
     */
    OrderRefundQueryOperation<WechatOrderRefundQueryRequestParam
            , WechatOrderRefundQueryResponse> opsForOrderRefundQuery();

    /**
     * 关闭订单
     * @return
     */
    OrderCloseOperation<WechatOrderCloseRequestParam, WechatOrderCloseResponse> opsForOrderClose();

    /**
     * 下载交易账单
     * @return
     */
    BillQueryOperation<WechatBillQueryRequestParam, WechatBillQueryResponse> opsForBillQuery();


    ProfitSharingAddReceiverOperation<ProfitSharingAddReceiverRequestParam, ProfitSharingAddReceiverResponse> opsForProfitSharingAddReceiver();

    ProfitSharingRemoveReceiverOperation<ProfitSharingRemoveReceiverRequestParam, ProfitSharingRemoveReceiverResponse> opsForProfitSharingRemoveReceiver();

    ProfitSharingOperation<ProfitSharingRequestParam,ProfitSharingResponse> opsForProfitSharingOperation();

    MultiProfitSharingOperation<MultiProfitSharingRequestParam,MultiProfitSharingResponse> opsForMultiProfitSharing();

    ProfitSharingQueryOperation<ProfitSharingQueryRequestParam,ProfitSharingQueryResponse> opsForProfitSharingQuery();

    ProfitSharingFinishOperation<ProfitSharingFinishRequestParam,ProfitSharingFinishResponse> opsForProfitSharingFinish();

    ProfitSharingReturnOperation<ProfitSharingReturnRequestParam,ProfitSharingReturnResponse> opsForProfitSharingReturn();

    ProfitSharingReturnQueryOperation<ProfitSharingReturnQueryRequestParam,ProfitSharingReturnQueryResponse> opsForProfitSharingReturnQuery();

    TransferOperation<TransferWechatRequestParam, TransferWechatResponse> opsForTransferOperation();

    TransferInfoGetOperation<TransferInfoGetRequest, TransferInfoGetResponse> opsForTransferInfoGetOperation();

    /**
     * 调用一次后保存到文件
     *
     * @return
     */
    PublicKeyGetOperation<PublicKeyGetRequest, PublicKeyGetResponse> opsForPublicKeyGetOperation();

    PayBankOperation<PayBankRequest, PayBankResponse> opsForPayBankOperation();

    PayBankQueryOperation<PayBankQueryRequest, PayBankQueryResponse> opsForPayBankQueryOperation();

    SendRedpackOperation<SendRedPackRequest, SendRedPackResponse> opsForSendRedpackOperation();

    SendGroupRedPackOperation<SendGroupRedPackRequest, SendGroupRedPackResponse> opsForSendGroupRedPackOperation();

    SendMiniProgramRedPackOperation<SendMiniProgramRedPackRequest, SendMiniProgramRedPackResponse> opsForSendMiniProgramRedPackOperation();

    RedPackGetInfoOperation<RedPackGetInfoRequest, RedPackGetInfoResponse> opsForRedPackGetInfoOperation();
}
