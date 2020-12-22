## 高的地图Web服务 API

### 特性
- [地理/逆地理编码](https://lbs.amap.com/api/webservice/guide/api/georegeo)

### 使用
#### 引入依赖
```xml
<dependency>
    <groupId>io.github.jast90</groupId>
    <artifactId>zhangtool-amap</artifactId>
    <version>latest-version</version>
</dependency>
```
#### 创建并使用`AMapTemplate`
```java
AMapTemplate amapTemplate = new AMapTemplate(key);//key高德地图申请的key
Point point = amapTemplate.opsForGeo().singleGeoCode(key, "地址");
```

