package com.G.system.potting;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UIModel extends ModelAndView {
    public UIModel(){
        this.setViewName("index");
    }
    public UIModel setTitleAndUrl(String title,String url){
        this.getModelMap().put("title", title);
        this.getModelMap().put("url", url);
        return this;
    }
    public UIModel put(String key, Object o){
        this.getModelMap().put(key,o);
        return this;
    }
    public UIModel setHtml(String html){
        this.getModelMap().put("html", html);
        return this;
    }
}
