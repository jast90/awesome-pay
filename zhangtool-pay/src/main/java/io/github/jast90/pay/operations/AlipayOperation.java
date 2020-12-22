package io.github.jast90.pay.operations;

public interface AlipayOperation<P,R> {
    R operation(P p);
}
