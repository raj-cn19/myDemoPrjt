package com.demoTest;

import java.util.HashSet;

public class HashmapEx1 {
	public static void main(String[] args) 
	{
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(20);
		hs.add(50);
		hs.add(30);
		hs.add(60);
		hs.add(20);
		System.out.println(hs);
		System.out.println(hs.size());
		// Print test
		System.out.println(hs.contains(60));
	}

}
