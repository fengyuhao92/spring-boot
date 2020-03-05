package tester.beans;

import org.springframework.cglib.proxy.Enhancer;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/2/10 7:30 PM
 */
public class CglibProxyTest {

	public static void main(String[] args){

		ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
		concurrentHashMap.put(null,"a");

		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(AppTradeProcessor.class);
		enhancer.setCallback(new AppProcessInterceptor());

		AppTradeProcessor proxyProcessor = (AppTradeProcessor)enhancer.create();
		proxyProcessor.validateTrade();

	}
}
