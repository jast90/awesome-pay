package cn.jast.awesome.pay;

import cn.jast.awesome.pay.operations.order.OrderOperation;
import cn.jast.awesome.pay.operations.order.impl.alipay.domain.AlipayOrderRequestParam;
import cn.jast.awesome.pay.operations.order.impl.alipay.domain.AlipayOrderResponse;

public interface AlipayOperations {

    /**
     * 统一下单
     *
     * @return
     */
    OrderOperation<AlipayOrderRequestParam, AlipayOrderResponse> opsForOrder();
}
