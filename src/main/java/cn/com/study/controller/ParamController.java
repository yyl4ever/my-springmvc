package cn.com.study.controller;

import cn.com.study.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 测试参数绑定
 * @Author: yangyl
 * @Date: 2019/11/2 23:42
 */
@Controller
@RequestMapping("/account")
public class ParamController {
    
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account) {
        System.out.println(account);
        return "success";
    }

    @RequestMapping("/saveAccount2")
    public String saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) {
        System.out.println(account);
        System.out.println(request);
        System.out.println(request.getSession());
        // 最大的域对象
        System.out.println(request.getSession().getServletContext());
        return "success";
    }
}
