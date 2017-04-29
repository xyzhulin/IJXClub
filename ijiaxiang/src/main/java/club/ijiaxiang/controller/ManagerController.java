package club.ijiaxiang.controller;

import club.ijiaxiang.pojo.Manager;
import club.ijiaxiang.service.ManagerService;
import club.ijiaxiang.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/")
public class ManagerController {
    private Logger logger = Logger.getLogger(ManagerController.class);

    @Resource(name = "ManagerService")
    private ManagerService managerService;

    @Resource(name = "UserService")
    private UserService userService;

    @RequestMapping(value = "/select",produces = "text/html; charset=UTF-8")
    public String testSSM(Model m){
        List<Manager> managers= managerService.findAll();
       m.addAttribute("hello",managerService.findByPhoneAndPwd("15002150961","000MrZero"));
        return "home";
    }

    @RequestMapping(value = "/selectUser",produces = "text/html; charset=UTF-8")
    public String testUserDao(Model m){
        m.addAttribute("hello",userService.findAllUser());
        return "index";
    }

}
