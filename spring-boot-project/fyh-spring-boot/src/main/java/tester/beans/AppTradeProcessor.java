package tester.beans;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/2/9 9:59 PM
 */
public class AppTradeProcessor implements BasicTradeProcessor{

	@Override
	public void processTrade() {
		System.out.println("processing AppTrade");
	}

	public void validateTrade(){
		System.out.println("validateTrade AppTrade");
	}
}
