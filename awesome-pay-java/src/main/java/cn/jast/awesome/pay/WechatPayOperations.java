package cn.jast.awesome.pay;


import cn.jast.awesome.pay.operations.bill.BillQueryOperation;
import cn.jast.awesome.pay.operations.bill.impl.wechat.domain.WechatBillQueryRequestParam;
import cn.jast.awesome.pay.operations.bill.impl.wechat.domain.WechatBillQueryResponse;
import cn.jast.awesome.pay.operations.order.*;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.*;
import cn.jast.awesome.pay.operations.profitsharing.*;
import cn.jast.awesome.pay.operations.profitsharing.impl.wechat.domain.*;

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
}
