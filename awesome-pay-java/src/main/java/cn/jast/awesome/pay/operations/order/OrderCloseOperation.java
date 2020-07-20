package cn.jast.awesome.pay.operations.order;

/**
 * 关闭订单
 *
 * @param <P>
 * @param <R>
 */
public interface OrderCloseOperation<P,R> {

    R orderClose(P p);

}
