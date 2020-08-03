package cn.jast.awesome.pay.operations.transfer;

public interface TransferOperation<P,R> {
    R transfer(P p);
}
