package tester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tester.beans.ConcreteProcessor;
import tester.beans.TestBeanOne;


/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/1/2 2:27 PM
 */
@RestController
@SpringBootApplication
public class FyhApplication {
	@Autowired
	TestBeanOne testBeanOne;
	@Autowired
	ConcreteProcessor concreteProcessor;



	@RequestMapping("/")
	String home() {
		testBeanOne.testProcess();
		return "";
	}

	public static void main(String[] args){
		SpringApplication.run(FyhApplication.class, args);
	}
}
