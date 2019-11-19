package cn.com.study.component;

import cn.com.study.exception.SysException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: yangyl
 * @Date: 2019/11/19 13:50
 * 全局异常解析器
 */
public class SysExceptionResolver implements HandlerExceptionResolver{
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception ex) {
        SysException e = null;
        ex.printStackTrace();
        if (ex instanceof SysException) {
            e = (SysException)ex;
        } else {
            e = new SysException("系统正在维护...");
        }
        
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg", e.getMsg());
        mv.setViewName("error");
        return mv;
    }
}
