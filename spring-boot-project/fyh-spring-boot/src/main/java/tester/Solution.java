package tester;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/2/22 3:47 PM
 */
public class Solution {

	public static void main(String[] args){
		int n =50;
		List<Integer> list = new ArrayList<>();

		for(int i=1; i<10;i++){
			dfs(i, n, list);
		}

		System.out.println(list);


	}

	public static void dfs(int target, int n, List<Integer> list){
		if(target<n){
			list.add(target);
		}else{
			return;
		}

		target = target*10;

		for(int s=0;s<10;s++){
			dfs(target+s,n,list);
		}

	}

}
