package cn.jast.awesome.pay.operations.profitsharing;

/**
 *
 * @param <P>
 * @param <R>
 */
public interface ProfitSharingOperation<P,R> {
    R profitSharing(P p);
}
