# Mygson
个人gson封装库

本工程copy于google的开源gson库，并对其进行了包装。

使用方法    
    1、首先将本工程目录下的`sengson`文件夹copy到你自己的工程目录下。    
    2、在你的工程目录先找到`settings.gadle`文件，添加：`include ':App',':sengson'`。   
    3、再打开工程目录下的`App/build.gradle`文件，添加依赖工程，如下：`compile project(':sengson')`
