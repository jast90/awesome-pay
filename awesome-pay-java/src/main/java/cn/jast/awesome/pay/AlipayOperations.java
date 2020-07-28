package cn.jast.awesome.pay;

import cn.jast.awesome.pay.operations.order.OrderOperation;
import cn.jast.awesome.pay.operations.order.OrderPrepareOperation;
import cn.jast.awesome.pay.operations.order.OrderQueryOperation;
import cn.jast.awesome.pay.operations.order.OrderRefundOperation;
import cn.jast.awesome.pay.operations.order.impl.alipay.domain.*;

public interface AlipayOperations {

    /**
     * 统一下单
     *
     * @return
     */
    OrderOperation<AlipayOrderRequestParam, AlipayOrderResponse> opsForOrder();

    /**
     * 预下单（扫码下单）
     * @return
     */
    OrderPrepareOperation<AlipayOrderPrepareRequestParam, AlipayOrderPrepareResponse> opsForOrderPrepare();

    /**
     * 查询订单
     *
     * @return
     */
    OrderQueryOperation<AlipayOrderQueryRequestOParam,AlipayOrderQueryResponse> opsForOrderQueryOperation();

    /**
     * 申请退款
     *
     * @return
     */
    OrderRefundOperation<AlipayOrderRefundRequestParam,AlipayOrderRefundResponse> opsForOrderRefundOperation();
}
