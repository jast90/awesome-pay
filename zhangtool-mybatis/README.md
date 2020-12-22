# awesome-mybatis
## 特性
- 分页插件，当前支持MySQL

## 使用
### 引入依赖
```xml
<dependency>
    <groupId>cn.jast</groupId>
    <artifactId>awesome-mybatis</artifactId>
    <version>latest-version</version>
</dependency>
```
### Java Mapper
```java
package cn.jast.payment.mapper;

import cn.jast.mybatis.pagination.domain.PageList;
import cn.jast.mybatis.pagination.domain.PageRequest;
import cn.jast.payment.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {
    PageList<Order> selectPage(@Param("pageRequest") PageRequest pageRequest);
}
```

### XML Mapper
```xml
<select id="selectPage" resultMap="BaseResultMap">
    select id, version, create_time, update_time, status, order_no, order_amount,
    order_from, merchant_name, merchant_no, order_time, order_date, order_ip, order_referer_url,
    cancel_reason, order_period, expire_time, pay_way_code, pay_way_name, remark, trx_type,
    trx_no, pay_type_code, pay_type_name, fund_into_type, is_refund, refund_times, success_refund_amount,
    user_id
    from payment_order
  </select>
```
