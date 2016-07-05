package org.ahu.edu.BigDataLab.web;

import com.jfinal.core.Controller;

/**
 * Created by plutolove on 16-7-5.
 */
public class IndexController extends Controller {

    public void hello(){

        renderJsp("index.jsp");
    }


}
