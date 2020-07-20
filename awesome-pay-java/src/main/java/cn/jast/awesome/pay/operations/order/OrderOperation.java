package cn.jast.awesome.pay.operations.order;

/**
 * 直接下单
 *
 * @param <P>
 * @param <R>
 */
public interface OrderOperation<P,R> {

    R order(P p);
}