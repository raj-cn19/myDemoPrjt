package com.demoTest;

public class PyramidPattern {
	
	public static void main (String [] args)
	{
		int a=5;
		printPyramid(a);
		//for(int i=0;i<)
	}
	public static void printPyramid(int n)
	{
		for (int i=1;i<=n;i++)
		{
			//System.out.println();
			for (int j=1;j<=n-i;j++) 
			{
				System.out.print(" ");
			}
				for(int k=1;k<=i;k++)
				{
					System.out.print("* ");
					
				}
				System.out.println();
			}
		
		}
}
