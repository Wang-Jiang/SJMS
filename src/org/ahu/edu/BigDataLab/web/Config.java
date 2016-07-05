package org.ahu.edu.BigDataLab.web;


import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import org.ahu.edu.BigDataLab.DB.*;

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

        C3p0Plugin cp = new C3p0Plugin("jdbc:mysql://172.19.142.178:3306/sjms", "root", "lemon123");
        me.add(cp);
        ActiveRecordPlugin arp = new ActiveRecordPlugin(cp);
        me.add(arp);
        arp.addMapping("user", "uid", User.class);
        arp.addMapping("job", "uid, jid", Job.class);
    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {

    }

}
