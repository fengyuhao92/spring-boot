package tester.list;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.FutureTask;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/2/21 3:01 PM
 */
public class CyclicBarrierDemo {

	public static void main(String[] args){

		CyclicBarrier barrier = new CyclicBarrier(4, null);
		CountDownLatch cdl = new CountDownLatch(10);



		for(int i=0;i<=2;i++){
			Thread thread = new Thread(new CdlThread(cdl));
			thread.start();
		}
	}
}
