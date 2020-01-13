package tester.beans;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/1/9 10:13 AM
 */
public abstract class AbstractFyhProcessor {

	public String processorType;

	abstract String doProcess();

	public boolean compareProcessType(String processorType){

		return this.processorType.equals(processorType);
	}

	public AbstractFyhProcessor(){
		//TestBeanOne.processorList.add(this);
	}

}
