package cn.deepclue.eyes.web.config;

import cn.deepclue.common.exception.NotLoginException;
import cn.deepclue.eyes.annotation.CurrentAccount;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import cn.deepclue.eyes.domain.po.management.*;

@Component
public class CurrentAccountMethodArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.getParameterType().isAssignableFrom(AccountBO.class) && parameter.hasParameterAnnotation(CurrentAccount.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        AccountBO account = (AccountBO) webRequest.getAttribute("currentAccount", RequestAttributes.SCOPE_REQUEST);

        if (account != null) {
            return account;
        }

        return new NotLoginException();
    }
}
