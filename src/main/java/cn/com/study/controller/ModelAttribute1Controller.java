package cn.com.study.controller;

import cn.com.study.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试常用注解
 * @Author: yangyl
 * @Date: 2019-11-3 14:40:49
 */
@Controller
public class ModelAttribute1Controller {
    
    @ModelAttribute
    public void showModel(Account account) {
        System.out.println("执行了 showModel" + account);
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(Account account) {
        System.out.println("执行了 testModelAttribute" + account);
        return "success";
    }

    @RequestMapping("/testModelAttribute2")
    public String testModelAttribute2(Account account) {
        System.out.println("执行了 testModelAttribute2" + account);
        return "success";
    }
    
}