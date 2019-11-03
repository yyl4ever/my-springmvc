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
public class ModelAttribute2Controller {
    
    @ModelAttribute
    public Account showModel() {
        Account account = this.findById(1L);
        System.out.println("执行了 showModel" + account);
        return account;
    }

    @RequestMapping("/testModelAttribute3")
    public String testModelAttribute(Account account) {
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