package tester.list;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/2/14 1:20 AM
 */
public class MyThread implements Runnable {

	private ReentrantLock lock;

	public MyThread(ReentrantLock reentrantLocklock){
		lock = reentrantLocklock;
	}

	@Override
	public void run() {
		System.out.println("进入线程："+Thread.currentThread().getName());
		lock.lock();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			return;
		}

		System.out.println("退出线程："+Thread.currentThread().getName());
		lock.unlock();
	}



}
