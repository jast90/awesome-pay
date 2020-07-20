package cn.jast.awesome.pay.operations.order;

/**
 * 申请退款
 * @param <P>
 * @param <R>
 */
public interface OrderRefundOperation<P,R> {

    R orderRefund(P p);

}
