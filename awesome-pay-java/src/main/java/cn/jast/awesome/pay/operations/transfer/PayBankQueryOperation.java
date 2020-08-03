package cn.jast.awesome.pay.operations.transfer;

public interface PayBankQueryOperation<P,R> {

    R queryBank(P p);
}
