package org.ahu.edu.BigDataLab.web;

import com.jfinal.core.Controller;
import org.ahu.edu.BigDataLab.DB.*;
import java.util.List;

/**
 * Created by plutolove on 16-7-5.
 */
public class IndexController extends Controller {

    public void hello(){
        User admin = new User();
        admin.put("uname", "124334");
        admin.put("upasswd", "2134344654");
        admin.save();
        renderJsp("index.jsp");
    }
}
