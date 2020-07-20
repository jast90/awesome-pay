package cn.jast.awesome.pay.operations.order;

/**
 * 查询退款
 * @param <P>
 * @param <R>
 */
public interface OrderRefundQueryOperation<P,R> {

    R  orderRefundQuery(P p);

}
