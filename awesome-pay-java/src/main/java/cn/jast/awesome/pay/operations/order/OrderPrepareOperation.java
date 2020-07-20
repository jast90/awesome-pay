package cn.jast.awesome.pay.operations.order;

/**
 * 扫码下单（预下单）
 *
 * @param <P>
 * @param <R>
 */
public interface OrderPrepareOperation<P,R> {

    R orderScan(P p);
}