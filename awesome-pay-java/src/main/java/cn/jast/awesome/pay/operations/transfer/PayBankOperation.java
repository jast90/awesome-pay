package cn.jast.awesome.pay.operations.transfer;

public interface PayBankOperation<P,R> {
    R payBank(P p);
}
