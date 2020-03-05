package tester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tester.beans.ConcreteProcessor;
import tester.beans.PreImportBean;
import tester.beans.TestBeanOne;

import javax.annotation.Resource;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/1/2 2:27 PM
 */
@RestController
@SpringBootApplication
@EnableAspectJAutoProxy
public class FyhApplication {
	@Resource
	TestBeanOne testBeanOne;

	@RequestMapping("/")
	String home() {
		testBeanOne.getBeanName();
		return "";
	}

	public static void main(String[] args){
		SpringApplication.run(FyhApplication.class, args);
	}
}
