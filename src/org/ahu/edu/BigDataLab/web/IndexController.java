package org.ahu.edu.BigDataLab.web;

import com.jfinal.core.Controller;
import org.ahu.edu.BigDataLab.DB.*;
/**
 * Created by plutolove on 16-7-5.
 */
public class IndexController extends Controller {

    public void index(){
        User admin = new User();
        admin.put("uname", "admin");
        admin.put("upasswd", "admin");
        admin.save();
        renderJsp("index.jsp");
    }
}
