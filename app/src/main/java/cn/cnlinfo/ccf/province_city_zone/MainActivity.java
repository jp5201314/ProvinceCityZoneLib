package cn.cnlinfo.ccf.province_city_zone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.PopupWindow;

import com.orhanobut.logger.Logger;

import cn.cnlinfo.ccf.province_city_zone.callback.GainAreaCallBack;
import cn.cnlinfo.ccf.province_city_zone.data.ChooseArea;
import cn.cnlinfo.ccf.province_city_zone.entity.City;
import cn.cnlinfo.ccf.province_city_zone.entity.Districts;
import cn.cnlinfo.ccf.province_city_zone.entity.Province;
import cn.cnlinfo.ccf.province_city_zone.popup_window.ChooseAreaPopup;


public class MainActivity extends AppCompatActivity {
    private PopupWindow popupWindow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void chooseArea(View view){
        popupWindow = ChooseAreaPopup.getInstance(this,view).showPupopWindow(new GainAreaCallBack() {
            @Override
            public void gainArea(Province province, City city, Districts districts) {
                Logger.d(province.getProvinceName()+"\n"+city.getCityName()+"\n"+districts.getDistrictsName());
                Logger.d(province.getId()+"-"+city.getCityId()+"-"+districts.getDistrictsId());
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (popupWindow!=null&&popupWindow.isShowing()){
            popupWindow.dismiss();
        }
    }
}
