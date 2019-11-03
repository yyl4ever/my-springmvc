package cn.com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * 测试常用注解
 * @Author: yangyl
 * @Date: 2019-11-3 14:40:49
 */
@Controller
@SessionAttributes(value = {"msg"})
public class SessionAttributeController {
    
    @RequestMapping(value = "/testSessionAttribute")
    public String testSessionAttribute(Model model) {
        // request 
        model.addAttribute("msg", "fff");
        // 跳转之前将数据存入了session
        return "session";
    }

    @RequestMapping(value = "/getSessionAttribute")
    public String getSessionAttribute(ModelMap modelMap) {
        // session 
        String msg = ((String) modelMap.get("msg"));
        System.out.println(msg);
        return "success";
    }

    /**
     * 删除 session 所有内容
     * @param sessionStatus
     * @return
     */
    @RequestMapping(value = "/delSessionAttributes")
    public String delSessionAttribute(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        return "success";
    }
    
}