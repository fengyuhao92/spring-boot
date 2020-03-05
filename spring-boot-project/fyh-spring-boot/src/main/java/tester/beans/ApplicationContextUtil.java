package tester.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2019/11/22 2:42 PM
 */
@Component
public class ApplicationContextUtil implements ApplicationContextAware {

	@Resource
	TestBeanOne testBeanOne;

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    	testBeanOne.testProcess();
        ApplicationContextUtil.context = applicationContext;
    }

    /**
     * 根据clazz获取容器内的bean
     * @param clazz
     * @return
     */
    public static <T> T getBean(Class<T> clazz){
        return context.getBean(clazz);
    }
}
