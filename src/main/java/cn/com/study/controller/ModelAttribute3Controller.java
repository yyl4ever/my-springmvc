package cn.com.study.controller;

import cn.com.study.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 测试常用注解
 * @Author: yangyl
 * @Date: 2019-11-3 14:40:49
 */
@Controller
public class ModelAttribute3Controller {
    
    @ModelAttribute
    public void showModel(Map<String, Account> map) {
        Account account = this.findById(1L);
        System.out.println("执行了 showModel" + account);
        map.put("abc", account);
    }

    @RequestMapping("/testModelAttribute4")
    public String testModelAttribute(@ModelAttribute("abc") Account account) {
        System.out.println("执行了 testModelAttribute" + account);
        return "success";
    }

    /**
     * 模拟从数据库中获取数据
     * @param id
     * @return
     */
    public Account findById(Long id) {
        Account account = new Account();
        account.setUsername("zs");
        account.setAge(22);
        return account;
    }
    
}