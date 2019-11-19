package cn.com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试异常处理
 * @Author: yangyl
 * @Date: 2019/11/19 13:27
 */
@Controller
@RequestMapping("/exTest")
public class ExceptionTestController {
    
    @RequestMapping("/testException")
    public String testException(){
        // mock exception
        int i = 1/0;
        return "success";
    }
}
