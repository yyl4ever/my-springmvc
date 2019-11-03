package cn.com.study.controller;

import cn.com.study.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: yangyl
 * @Date: 2019-11-03 17.15.40
 */
@Controller
@RequestMapping("/user")
public class ResponseController {

    @RequestMapping(path = "/testAjax")
    public @ResponseBody Account testAjax(@RequestBody Account account) {
        System.out.println(account);
        return account;
    }
}
