package tester.list;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/2/21 7:01 PM
 */
public class CdlThread implements Runnable{

	private CountDownLatch latch;

	public CdlThread(CountDownLatch countDownLatch){
		latch = countDownLatch;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(1000);
			System.out.println(getName() + " 到达栅栏 A");
			latch.countDown();
			System.out.println(getName() + " 冲破栅栏 A");

//			Thread.sleep(2000);
//			System.out.println(getName() + " 到达栅栏 B");
//			barrier.await();
//			System.out.println(getName() + " 冲破栅栏 B");
		}catch (Exception e){

		}
	}

	private String getName() {
		return Thread.currentThread().getName();
	}

}
