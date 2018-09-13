package com.jason.player.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.jason.player.entity.City;
import com.jason.player.entity.Districts;
import com.jason.player.entity.Province;
import com.wx.wheelview.adapter.BaseWheelAdapter;
import com.wx.wheelview.widget.WheelItem;

/**
 * Created by Administrator on 2018/2/6 0006.
 */

public class ObjectWheelAdapter extends BaseWheelAdapter {
    private Context mContext;

    public ObjectWheelAdapter(Context context) {
        mContext = context;
    }

    @Override
    public View bindView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = new WheelItem(mContext);
        }
        WheelItem item = (WheelItem) convertView;
        if (mList.get(position) instanceof Province){
            item.setText(((Province) mList.get(position)).getProvinceName());
        }else if (mList.get(position) instanceof City){
            item.setText(((City) mList.get(position)).getCityName());
        }else if (mList.get(position) instanceof Districts){
            item.setText(((Districts) mList.get(position)).getDistrictsName());
        }
        return convertView;
    }
}
