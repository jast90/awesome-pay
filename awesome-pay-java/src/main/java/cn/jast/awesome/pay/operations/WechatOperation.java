package cn.jast.awesome.pay.operations;

import cn.jast.awesome.pay.domain.wechat.BaseWechatRequest;

public interface WechatOperation<P extends BaseWechatRequest,R> {
    R operation(P p,String key);
}
