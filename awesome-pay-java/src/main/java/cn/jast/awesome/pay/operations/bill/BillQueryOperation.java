package cn.jast.awesome.pay.operations.bill;

/**
 * 查询交易账单（对账）
 *
 * @param <P>
 * @param <R>
 */
public interface BillQueryOperation<P,R> {

    R billQuery(P p);

}
