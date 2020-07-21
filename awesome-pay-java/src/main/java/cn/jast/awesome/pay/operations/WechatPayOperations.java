package cn.jast.awesome.pay.operations;


import cn.jast.awesome.pay.operations.bill.BillQueryOperation;
import cn.jast.awesome.pay.operations.bill.impl.wechat.domain.WechatBillQueryRequestParam;
import cn.jast.awesome.pay.operations.bill.impl.wechat.domain.WechatBillQueryResponse;
import cn.jast.awesome.pay.operations.order.*;
import cn.jast.awesome.pay.operations.order.impl.wechat.domain.*;

public interface WechatPayOperations {

    OrderOperation<WechatOrderRequestParam, WechatOrderResponse> opsForOrder();

    OrderPrepareOperation<WechatOrderRequestParam, WechatOrderResponse> opsForOrderPrepare();

    OrderQueryOperation<WechatOrderQueryRequestParam, WechatOrderQueryResponse>  opsForOrderQuery();

    OrderRefundOperation<WechatOrderRefundRequestParam, WechatOrderRefundResponse> opsForOrderRefund();

    OrderRefundQueryOperation<WechatOrderRefundQueryRequestParam
            , WechatOrderRefundQueryResponse> opsForOrderRefundQuery();

    OrderCloseOperation<WechatOrderCloseRequestParam, WechatOrderCloseResponse> opsForOrderClose();

    BillQueryOperation<WechatBillQueryRequestParam, WechatBillQueryResponse> opsForBillQuery();

}
