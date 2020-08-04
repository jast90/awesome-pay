package cn.jast.awesome.pay.operations;

public interface AlipayOperation<P,R> {
    R operation(P p);
}
