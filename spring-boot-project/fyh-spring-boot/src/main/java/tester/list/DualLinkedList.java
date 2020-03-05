package tester.list;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/2/14 12:43 AM
 */
public class DualLinkedList {

	public static Node head;
	public static Node tail;


	public static void main(String[] args){
		ReentrantLock lock = new ReentrantLock();

		CyclicBarrier cb = new CyclicBarrier(10);

		CopyOnWriteArrayList cowal = new CopyOnWriteArrayList();
		cowal.get(2);



//		lock.lock();
//		System.out.println("主线程获得锁");
//		Thread t1 = new Thread(new MyThread(lock));
//		t1.start();
//
//		Thread t2 = new Thread(new MyThread(lock));
//		t2.start();
//
//
//		System.out.println("竞争锁的线程数："+lock.getQueueLength());
//
//		try {
//			t1.getState();
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//		lock.unlock();

	}
}
