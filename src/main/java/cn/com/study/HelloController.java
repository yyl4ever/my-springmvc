package cn.com.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: yangyl
 * @Date: 2019/11/2 23:42
 */
@Controller
public class HelloController {
    
    @RequestMapping(path = "/hello")
    public String sayHello() {
        System.out.println("hello SpringMVC!");
        // 默认该字符串与 jsp 文件名相同
        return "success";
    }
}
