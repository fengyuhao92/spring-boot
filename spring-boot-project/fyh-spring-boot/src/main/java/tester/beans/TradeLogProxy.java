package tester.beans;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/2/9 10:00 PM
 */
public class TradeLogProxy implements InvocationHandler {

	public Object targetObject;

	public TradeLogProxy(Object target){
		targetObject=target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before process");
		method.invoke(targetObject, args);
		System.out.println("after process");
		return null;
	}
}
