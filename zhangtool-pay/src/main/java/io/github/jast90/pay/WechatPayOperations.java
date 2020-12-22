package io.github.jast90.pay;


import io.github.jast90.pay.operations.WechatOperation;
import io.github.jast90.pay.operations.bill.impl.wechat.domain.WechatBillQueryRequestParam;
import io.github.jast90.pay.operations.bill.impl.wechat.domain.WechatBillQueryResponse;
import io.github.jast90.pay.operations.order.impl.wechat.domain.*;
import io.github.jast90.pay.operations.profitsharing.impl.wechat.domain.*;
import io.github.jast90.pay.operations.redpack.impl.wechat.domain.*;
import io.github.jast90.pay.operations.transfer.impl.wechat.domain.*;

public interface WechatPayOperations {

    /**
     * 统一下单
     *
     * @return
     */
    WechatOperation<WechatOrderRequestParam, WechatOrderResponse> opsForOrder();

    /**
     * 统一下单（预下单）
     * @return
     */
    WechatOperation<WechatOrderRequestParam, WechatOrderResponse> opsForOrderPrepare();

    /**
     * 查询订单
     * @return
     */
    WechatOperation<WechatOrderQueryRequestParam, WechatOrderQueryResponse>  opsForOrderQuery();

    /**
     * 申请退款（需要证书）
     * @return
     */
    WechatOperation<WechatOrderRefundRequestParam, WechatOrderRefundResponse> opsForOrderRefund();

    /**
     * 查询退款
     * @return
     */
    WechatOperation<WechatOrderRefundQueryRequestParam
            , WechatOrderRefundQueryResponse> opsForOrderRefundQuery();

    /**
     * 关闭订单
     * @return
     */
    WechatOperation<WechatOrderCloseRequestParam, WechatOrderCloseResponse> opsForOrderClose();

    /**
     * 下载交易账单
     * @return
     */
    WechatOperation<WechatBillQueryRequestParam, WechatBillQueryResponse> opsForBillQuery();


    WechatOperation<ProfitSharingAddReceiverRequestParam, ProfitSharingAddReceiverResponse> opsForProfitSharingAddReceiver();

    WechatOperation<ProfitSharingRemoveReceiverRequestParam, ProfitSharingRemoveReceiverResponse> opsForProfitSharingRemoveReceiver();

    WechatOperation<ProfitSharingRequestParam,ProfitSharingResponse> opsForProfitSharingOperation();

    WechatOperation<MultiProfitSharingRequestParam,MultiProfitSharingResponse> opsForMultiProfitSharing();

    WechatOperation<ProfitSharingQueryRequestParam,ProfitSharingQueryResponse> opsForProfitSharingQuery();

    WechatOperation<ProfitSharingFinishRequestParam,ProfitSharingFinishResponse> opsForProfitSharingFinish();

    WechatOperation<ProfitSharingReturnRequestParam,ProfitSharingReturnResponse> opsForProfitSharingReturn();

    WechatOperation<ProfitSharingReturnQueryRequestParam,ProfitSharingReturnQueryResponse> opsForProfitSharingReturnQuery();

    WechatOperation<TransferWechatRequestParam, TransferWechatResponse> opsForTransferOperation();

    WechatOperation<TransferInfoGetRequest, TransferInfoGetResponse> opsForTransferInfoGetOperation();

    /**
     * 调用一次后保存到文件
     *
     * @return
     */
    WechatOperation<PublicKeyGetRequest, PublicKeyGetResponse> opsForPublicKeyGetOperation();

    WechatOperation<PayBankRequest, PayBankResponse> opsForPayBankOperation();

    WechatOperation<PayBankQueryRequest, PayBankQueryResponse> opsForPayBankQueryOperation();

    WechatOperation<SendRedPackRequest, SendRedPackResponse> opsForSendRedpackOperation();

    WechatOperation<SendGroupRedPackRequest, SendGroupRedPackResponse> opsForSendGroupRedPackOperation();

    WechatOperation<SendMiniProgramRedPackRequest, SendMiniProgramRedPackResponse> opsForSendMiniProgramRedPackOperation();

    WechatOperation<RedPackGetInfoRequest, RedPackGetInfoResponse> opsForRedPackGetInfoOperation();
}
