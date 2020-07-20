package cn.jast.awesome.pay.operations.order;

/**
 * 查询订单
 * @param <P>
 * @param <R>
 */
public interface OrderQueryOperation<P,R> {

    R orderQuery(P p);
}
