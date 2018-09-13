package com.jason.player.callback;

import com.jason.player.entity.City;
import com.jason.player.entity.Districts;
import com.jason.player.entity.Province;

/**
 * Created by Administrator on 2018/2/5 0005.
 */

public interface GainAreaCallBack {
    void gainArea(Province province, City city, Districts districts);
}
