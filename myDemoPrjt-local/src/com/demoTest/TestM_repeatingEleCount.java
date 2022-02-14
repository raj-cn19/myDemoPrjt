package com.demoTest;

import java.util.HashMap;
import java.util.Map;

public class TestM_repeatingEleCount {
	
	
	// 5, 4, 1,4,2,4,2
	int [] arr = { 5, 4, 1,4,2,4,2};
	int n = arr.length;
	
	public static void findMaxCountNum(int [] arr, int n) 
	{
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for (int i=0;i<n;i++)
		{
			if(hm.containsKey(arr[i]))
			{
				int c= hm.get(arr[i]);
				hm.put(arr[i], c+1);
			}
		else if (!hm.containsKey(arr[i]))
		{
			hm.put(arr[i], 1);
			
		}
			for (Map.Entry<Integer, Integer> num : hm.entrySet()){
				
				if(num.getValue()>1)// enable condition to print only duplicate nums
					
					System.out.println(num.getKey()+"  count = " +num.getValue());
				//else
					//continue;
			}
		
	}
}
}
