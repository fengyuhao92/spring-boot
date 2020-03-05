package tester.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: <mailto:fengyuhao@youzan.com> NO.03182
 * @Date: 2020/3/3 7:50 PM
 */
public class CombineSolution {
	static Map<String,String> map = new HashMap<>();

	public static void main(String[] args){
		printAllCombination("abaa");
	}





	public static void printAllCombination(String str){
		for(int length=1;length<=str.length();length++){
			for(int index=0;index+length<=str.length();index++){

				if(map.get(str.substring(index,index+length)) == null){
					System.out.println(str.substring(index,index+length));
					map.put(str.substring(index,index+length),"");
				}else{
					continue;
				}

			}
		}
	}
}
