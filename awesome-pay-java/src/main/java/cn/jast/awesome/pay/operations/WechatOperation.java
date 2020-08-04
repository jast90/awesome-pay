package cn.jast.awesome.pay.operations;

import cn.jast.awesome.pay.domain.wechat.BaseWechatRequestParam;

public interface WechatOperation<P extends BaseWechatRequestParam,R> {
    R operation(P p,String key);
}
