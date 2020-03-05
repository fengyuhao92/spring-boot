package tester.beans;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/2/19 8:21 PM
 */
@Aspect
@Component
public class MyLogAnnotation {

	@Around("@annotation(LogAnnotation)")
	public void process(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("arountd");
	}
}
