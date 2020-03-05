package tester.leetcode;

import java.util.*;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/2/29 12:24 AM
 */
public class ArrayTest {

	public static void main(String[] args){

		int[] big = new int[]{1,2,3};
		int[] small = new int[]{1,2,3};

		ArrayTest a = new ArrayTest();

		TreeMap<String,String> tm = new TreeMap<>();
		tm.put(null,"a");


		Hashtable<String,String> ht = new Hashtable<>();
		ht.put(null,"a");


		int[] r = a.shortestSeq(big,small);
	}

	public int[] shortestSeq(int[] big, int[] small) {
		if(small.length>big.length)
			return new int[0];
		Map<Integer,Integer> map=new HashMap<>();
		int count=small.length;
		int[] ans={0,big.length};

		for(int i:small)
			map.put(i,-1);

		for(int i=0;i<big.length;i++){
			if(map.containsKey(big[i])){
				if(map.get(big[i])==-1)
					count--;
				map.put(big[i],i);
			}
			if(count<=0){
				Collection<Integer> c = map.values();
				Object[] obj = c.toArray();
				int minNum=getMin(obj);
				if(i-minNum+1<ans[1]-ans[0]+1){
					ans[0]=minNum;
					ans[1]=i;
				}
			}
		}
		if(count>0)
			return new int[0];
		return ans;
	}

	int getMin(Object[] obj){
		int minNum=Integer.MAX_VALUE;
		for(Object i:obj){
			minNum=Math.min((int)i,minNum);
		}
		return minNum;
	}

}
