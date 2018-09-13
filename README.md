# Province_City_Zone
省市县三级联动
通过xml文件读取省市县信息显示在底部弹窗中

How to
To get a Git project into your build:
Gradle:
Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.jp5201314:Province_City_Zone:1.0.4'
	}
  
  maven:
  Step 1. Add the JitPack repository to your build file

  Add it in your root build.gradle at the end of repositories:
  
    <repositories>
      <repository>
          <id>jitpack.io</id>
          <url>https://jitpack.io</url>
      </repository>
    </repositories>

Step 2. Add the dependency

	<dependency>
	    <groupId>com.github.jp5201314</groupId>
	    <artifactId>Province_City_Zone</artifactId>
	    <version>1.0.4</version>
	</dependency>


实例代码：
需传入上下问对象和相应的View对象:

     popupWindow = ChooseAreaPopup.getInstance(context,view);
        if (!popupWindow.isShowing()){
            popupWindow.showPupopWindow(new GainAreaCallBack() {
                @Override
                public void gainArea(Province province, City city, Districts districts) {
                    Logger.d(province.getProvinceName()+"\n"+city.getCityName()+"\n"+districts.getDistrictsName());
                    Logger.d(province.getId()+"-"+city.getCityId()+"-"+districts.getDistrictsId());
                }
            });
        }
