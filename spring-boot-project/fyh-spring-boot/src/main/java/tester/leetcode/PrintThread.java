package tester.leetcode;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/2/23 11:49 PM
 */
public class PrintThread implements Runnable{

	private String value;
	private Thread thread;

	public PrintThread(String s, Thread t){
		value = s;
		thread = t;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(100);
			if(thread!=null){
				thread.start();
				thread.join();
			}

			System.out.println(value);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
