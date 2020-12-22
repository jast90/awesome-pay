package io.github.jast90.amap;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by zhiwen on 2017/6/12.
 */
public class AMapTemplateTest {
    private String key = "aaf82134989a8340917d3c9f5f8f2b4c";
    private AMapTemplate amapTemplate;

    @Before
    public void setUp() {
        amapTemplate = new AMapTemplate(key);
    }


    @Test
    public void geoCode() {
        System.out.println(amapTemplate.opsForGeo().singleGeoCode(key, "横峰县姚家乡建作毛干"));
        System.out.println(amapTemplate.opsForGeo().singleGeoCode(key, "横峰县广场西路192号"));
        System.out.println(amapTemplate.opsForGeo().singleGeoCode(key, "横峰县第二小学西侧"));
        System.out.println(amapTemplate.opsForGeo().singleGeoCode(key, "横峰县岑阳镇白沙岭"));
    }
}
