package cn.com.study.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: yangyl
 * @Date: 2019/11/19 15:33
 */
public class MyInterceptorA implements HandlerInterceptor {
    /**
     * 
     * @param request
     * @param response
     * @param handler
     * @return true 放行; false, 不放行
     * @throws Exception
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
        // 针对权限等做校验
        request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request, response);
        return false;
    }
}