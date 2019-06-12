package org.indresh.solution;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int arr[]=new int[age];
		for(int i=0;i<age;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(CandleBlow(arr,age));
		sc.close();
	}
	
	public static int CandleBlow(int arr[],int n)
	{
		int max=1,count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				count=1;	
			}
			else if(arr[i]==max)
			{
				count++;
			}
		}
		return count;
	}

}
