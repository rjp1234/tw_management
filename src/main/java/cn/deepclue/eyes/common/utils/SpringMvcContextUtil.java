package cn.deepclue.eyes.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 获取spring mvc的上下文
 *
 * @author wfan
 * @since 0.1
 * @version 0.1
 */
@Component
public class SpringMvcContextUtil implements ApplicationContextAware {

    /**
     * Spring应用上下文环境
     */
	private static ApplicationContext applicationContext;

    @Override
	public void setApplicationContext(ApplicationContext ac) throws BeansException {
		applicationContext = applicationContext == null ? ac : applicationContext;
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public static <T> T getBean(Class<T> clazz) throws BeansException {
		return applicationContext.getBean(clazz);
	}

}