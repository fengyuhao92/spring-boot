package tester.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/2/23 7:19 PM
 */
public class SumDemo {



	public static void main(String[] args){

		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,5,100, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.AbortPolicy());




		for(int i=0;i<100;i++){
			Thread tA = new Thread(new PrintThread("A", null));
			Thread tB = new Thread(new PrintThread("B", tA));
			Thread tC = new Thread(new PrintThread("C", tB));
			tC.start();
			try {
				tC.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}


		//threadPoolExecutor.execute(tA);
		//threadPoolExecutor.execute(tB);


		//System.out.println(threadPoolExecutor.getQueue());
	}
}
