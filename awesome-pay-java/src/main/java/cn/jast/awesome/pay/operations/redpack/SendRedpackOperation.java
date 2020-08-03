package cn.jast.awesome.pay.operations.redpack;

public interface SendRedpackOperation<P,R> {
    R sendRedPack(P p);
}
