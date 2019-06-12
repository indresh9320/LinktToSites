package org.indresh.solution;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n[]=new int[5];
		for(int i=0;i<5;i++)
		{
			n[i]=sc.nextInt();
		}
		findMinMax(n);
		sc.close();
		}
	public static void findMinMax(int []n)
	{
		int min=n[0];
		int max=n[0];
		long sum=n[0];
		for(int i=1;i<5;i++)
		{
			if(min>n[i])
				min=n[i];
			if(max<n[i])
				max=n[i];
			sum=sum+n[i];
		}
		long maxAdd=sum-min;
		long minAdd=sum-max;
		System.out.println(minAdd+" "+maxAdd);
	}
	
	public static void printPattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i+1;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
