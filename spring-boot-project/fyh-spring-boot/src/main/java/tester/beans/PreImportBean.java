package tester.beans;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.stereotype.Component;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/1/8 5:44 PM
 */
@Component
public class PreImportBean {

	public String getBeanName(){
		return "PreImportBean";
	}
}
