package cn.jast.awesome.pay;

import cn.jast.awesome.pay.operations.AlipayOperation;
import cn.jast.awesome.pay.operations.order.impl.alipay.domain.*;

public interface AlipayOperations {

    /**
     * 统一下单
     *
     * @return
     */
    AlipayOperation<AlipayOrderRequestParam, AlipayOrderResponse> opsForOrder();

    /**
     * 预下单（扫码下单）
     * @return
     */
    AlipayOperation<AlipayOrderPrepareRequestParam, AlipayOrderPrepareResponse> opsForOrderPrepare();

    /**
     * 查询订单
     *
     * @return
     */
    AlipayOperation<AlipayOrderQueryRequestOParam,AlipayOrderQueryResponse> opsForOrderQueryOperation();

    /**
     * 申请退款
     *
     * @return
     */
    AlipayOperation<AlipayOrderRefundRequestParam,AlipayOrderRefundResponse> opsForOrderRefundOperation();
}
