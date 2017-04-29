package club.ijiaxiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/4/27.
 * Author 朱霖
 * Func:首页页面请求跳转
 */
@Controller
@RequestMapping("/")
public class HomeController {
    /**
    *CreateTime:2017/4/27 21:28
    *Author:朱霖
    *Description:首页页面的跳转
    */
    @RequestMapping(value = "/home")
    public ModelAndView jumpHome(){
        ModelAndView mv = new ModelAndView("home");
        return mv;
    }
}
