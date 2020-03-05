package tester.beans;

import org.springframework.util.Base64Utils;

import java.lang.reflect.Proxy;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/2/2 8:41 PM
 */
public class Person {

	static List<Integer> work = Arrays.asList(1,2,3,4);
	static List<String> man = Arrays.asList("A","B");
	static HashMap<String,List<Integer>> workSheet = new HashMap<>(3);

	public static class fyh{
		String name="fengyuhao";

		List<String> list = new ArrayList<>();

		AtomicInteger a= new AtomicInteger(1);




		public void setName(String name){
			name = name;
		}

		public void getName(){
			System.out.println(name);
		}

		@Override
		public int hashCode() {
			return 1000;
		}

	}

	public static void main(String[] args) throws Throwable {

		ConcurrentHashMap chm = new ConcurrentHashMap();


		fyh a = new fyh();
		fyh b = new fyh();

		if(a==b){
			System.out.println(1);
		}

//		String b = Arrays.toString(Base64Utils.decode("c3VjbG9nZ2Vy".getBytes()));
//
//		System.out.println(b);

//		for(String m:man){
//			//先移除一个人
//			List<String> leftMan = new ArrayList<>(man);
//			leftMan.remove(m);
//			//剩下两人一人选一个任务
//			assignJob(work,leftMan);
//		}

	}

	private static void assignJob(List<Integer> work, List<String> man){
		for(String m:man){
			for(Integer w:work){
				List<Integer>  leftWork = assignAJob(m,w,work);
				List<String> leftMan = new ArrayList<>(man);
				leftMan.remove(m);
				if(leftMan.size()==0){
					assignLeft(m,leftWork);
					break;
				}else {
					assignJob(leftWork,leftMan);
				}
			}
			break;
		}
	}

	private static void assignLeft(String m, List<Integer> leftWork) {
		for(Integer w:leftWork){
			System.out.print(m+w);
		}
		System.out.println(";");

	}


	private static List<Integer> assignAJob(String m, Integer w, List<Integer> work) {
		List<Integer> tempWork = new ArrayList<>(work);
		tempWork.remove(w);
		System.out.print(m+w);
		return tempWork;
	}


	private static void initMap(HashMap<String,List<Integer>> man){
		man.put("A",new ArrayList<Integer>());
		man.put("B",new ArrayList<Integer>());
		man.put("C",new ArrayList<Integer>());
	}

}
