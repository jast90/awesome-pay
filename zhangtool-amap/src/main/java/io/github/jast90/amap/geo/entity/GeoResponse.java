package io.github.jast90.amap.geo.entity;


import io.github.jast90.amap.entity.CountResponse;

import java.util.List;

/**
 * Created by zhiwen on 2017/6/12.
 */
public class GeoResponse extends CountResponse {
    List<GeoCode> geocodes;

    public List<GeoCode> getGeocodes() {
        return geocodes;
    }

    public void setGeocodes(List<GeoCode> geocodes) {
        this.geocodes = geocodes;
    }
}
