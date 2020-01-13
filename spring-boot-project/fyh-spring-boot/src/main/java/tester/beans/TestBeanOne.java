package tester.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/1/8 12:54 AM
 */
@Component
public class TestBeanOne {

	@Autowired
	PreImportBean preImportBean;

	public static List<AbstractFyhProcessor> processorList = new ArrayList<>();


	public String getBeanName(){
		System.out.println(preImportBean.getBeanName());
		return "TestBeanOne";
	}

	public void testProcess(){



		for(AbstractFyhProcessor processor:processorList){

			//System.out.println(processorList.contains(ConcreteProcessor.class));

			System.out.println(((AbstractFyhProcessor)processor).compareProcessType("app"));
		}

	}

	public TestBeanOne(){
		System.out.println("init TestBeanOne");
	}


}
