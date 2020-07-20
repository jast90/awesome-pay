# awesome-pay
面向支付，多语言实现

## 微信支付
- [统一下单](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_1)
- [查询订单](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_2)
- [关闭订单](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_3)
- [申请退款](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_4)
- [查询退款](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_5)
- [下载交易账单](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_6)
- [下载资金账单-对账](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_18&index=7)
- [支付结果通知](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_7&index=8)
- [交易保障](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_8&index=9)
- [退款结果通知](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_16&index=10)
- [拉取订单评价数据](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_17&index=11)

## 支付宝支付
- [alipay.trade.precreate(统一收单线下交易预创建)-扫码支付](https://opendocs.alipay.com/apis/api_1/alipay.trade.precreate)
- [alipay.trade.wap.pay(手机网站支付接口2.0)](https://opendocs.alipay.com/apis/api_1/alipay.trade.wap.pay#%E5%93%8D%E5%BA%94%E5%8F%82%E6%95%B0)
- [alipay.trade.app.pay(app支付接口2.0)](https://opendocs.alipay.com/apis/api_1/alipay.trade.app.pay)
- [alipay.trade.page.pay(统一收单下单并支付页面接口)-PC场景下单并支付](https://opendocs.alipay.com/apis/api_1/alipay.trade.page.pay)
- [alipay.trade.create(统一收单交易创建接口)](https://opendocs.alipay.com/apis/api_1/alipay.trade.create)
- [alipay.trade.query(统一收单线下交易查询)()](https://opendocs.alipay.com/apis/api_1/alipay.trade.query)
- [alipay.trade.cancel(统一收单交易撤销接口)](https://opendocs.alipay.com/apis/api_1/alipay.trade.cancel)
- [alipay.trade.close(统一收单交易关闭接口)](https://opendocs.alipay.com/apis/api_1/alipay.trade.close)
- [alipay.trade.refund(统一收单交易退款接口)](https://opendocs.alipay.com/apis/api_1/alipay.trade.refund)
- [alipay.trade.page.refund(统一收单退款页面接口)](https://opendocs.alipay.com/apis/api_1/alipay.trade.page.refund)
- [alipay.trade.fastpay.refund.query(统一收单交易退款查询)](https://opendocs.alipay.com/apis/api_1/alipay.trade.fastpay.refund.query)
- [alipay.trade.order.settle(统一收单交易结算接口)](https://opendocs.alipay.com/apis/api_1/alipay.trade.order.settle)
- [alipay.data.bill.accountlog.query(支付宝商家账户账务明细查询-对账)](https://opendocs.alipay.com/apis/api_15/alipay.data.bill.accountlog.query)

## 银联支付

# 应用场景

- 扫码支付：通过支付宝或微信生成与支付订单，生成二维码码串
- 手机网站支付：
- app支付：
- 对账：商户可以通过交易账单接口下载历史交易清单。比如掉单、系统错误等导致商户侧和微信侧数据不一致，通过对账单核对后可校正支付状态。


# 参考
- [微信支付](https://pay.weixin.qq.com/wiki/doc/api/index.html)
- [支付宝支付](https://opendocs.alipay.com/open/00a0ut)
- [银联在线网关支付](https://open.unionpay.com/tjweb/acproduct/APIList?apiservId=448&acpAPIId=754&bussType=0)