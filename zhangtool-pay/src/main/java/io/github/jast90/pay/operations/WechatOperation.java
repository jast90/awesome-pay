package io.github.jast90.pay.operations;

import io.github.jast90.pay.domain.wechat.BaseWechatRequest;

public interface WechatOperation<P extends BaseWechatRequest,R> {
    R operation(P p,String key);
}
