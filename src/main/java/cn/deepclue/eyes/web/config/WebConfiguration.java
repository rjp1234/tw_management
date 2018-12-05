package cn.deepclue.eyes.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@Component
public class WebConfiguration extends WebMvcConfigurerAdapter {

    @Autowired
    private AuthenticationInterceptor loginInterceptor;

    @Autowired
    private CurrentAccountMethodArgumentResolver currentAccountMethodArgumentResolver;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor);
        super.addInterceptors(registry);
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(currentAccountMethodArgumentResolver);
        super.addArgumentResolvers(argumentResolvers);
    }
}
