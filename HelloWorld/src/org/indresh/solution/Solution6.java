package org.indresh.solution;

import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int t=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();
		int apples[]=new int[m];
		int oranges[]=new int[n];
		for(int i=0;i<m;i++)
			apples[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			oranges[i]=sc.nextInt();
		Solution(apples,oranges,s,t,a,b);
		sc.close();
	}
	
	public static void Solution(int apples[],int oranges[],int s,int t,int a,int b)
	{
		int []appleRes=new int[apples.length];
		int []orangesRes=new int[oranges.length];
		int count=0,count1=0;
		for(int i=0;i<apples.length;i++)
		{
			appleRes[i]=apples[i]+a;
		}
		for(int i=0;i<oranges.length;i++)
		{
			orangesRes[i]=oranges[i]+b;
		}
		for(int i=0;i<appleRes.length;i++)
		{
			if(s<=appleRes[i] && appleRes[i]<=t)
			{
				count++;
			}
		}
		for(int i=0;i<orangesRes.length;i++)
		{
			if(s<=orangesRes[i] && orangesRes[i]<=t)
			{
				count1++;
			}
		}
		System.out.println(count);
		System.out.println(count1);
	}

}
