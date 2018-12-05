package cn.deepclue.eyes.web.config;

import cn.deepclue.common.exception.NotLoginException;
import cn.deepclue.eyes.annotation.LoginRequired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import cn.deepclue.eyes.domain.po.management.*;

@Component
public class AuthenticationInterceptor implements HandlerInterceptor {

    private static Logger logger = LoggerFactory.getLogger(AuthenticationInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 其他非 http 处理方法全部放行
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }

        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        LoginRequired loginRequired = method.getAnnotation(LoginRequired.class);
        // 获取添加到Controler类上的注解
        if (loginRequired == null) {
            loginRequired = method.getDeclaringClass().getAnnotation(LoginRequired.class);
            // 没有 LoginRequired 注解的，都可以通过验证
            if (loginRequired == null) {
                return true;
            }
        }

        String username = request.getHeader("username");
        if (null == username) {
            throw new NotLoginException();
        }

        if (request.getAttribute("currentAccount") instanceof AccountBO) {
            logger.info(String.format("username：%s,访问：%s", username, request.getRequestURI()));
            return true;
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
