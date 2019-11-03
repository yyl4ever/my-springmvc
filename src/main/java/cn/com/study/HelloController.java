package cn.com.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: yangyl
 * @Date: 2019/11/2 23:42
 */
@Controller
@RequestMapping("/user")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello() {
        System.out.println("hello SpringMVC!");
        // 默认该字符串与 jsp 文件名相同
        return "success";
    }

    @RequestMapping(path = "/requestMapping", method = RequestMethod.GET, params = "username=hehe", headers = {"Accept"})
    public String requestMapping() {
        System.out.println("requestMapping");
        // 默认该字符串与 jsp 文件名相同
        return "success";
    }

}
