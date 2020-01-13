package tester.beans;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/1/9 10:08 AM
 */
@Component
public class ConcreteProcessor extends AbstractFyhProcessor implements BeanPostProcessor {

	@Override
	String doProcess() {
		System.out.println("app process");
		return "app process";
	}

}
