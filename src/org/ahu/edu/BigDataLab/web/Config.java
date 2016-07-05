package org.ahu.edu.BigDataLab.web;


import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;



public class Config extends JFinalConfig {

    @Override
    public void configConstant(Constants me) {
        //基本常量配置
        me.setDevMode(true);
        me.setEncoding("utf-8");

    }

    @Override
    public void configRoute(Routes me) {
        //路由配置
        me.add("/",IndexController.class);

    }

    @Override
    public void configPlugin(Plugins me) {

    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {

    }

}
