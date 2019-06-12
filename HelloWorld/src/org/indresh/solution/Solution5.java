package org.indresh.solution;

import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		Solution(arr);
		sc.close();
	}
	
	public static void Solution(int arr[])
	{
		int marks;
		for(int i=0;i<arr.length;i++)
		{
			marks=arr[i];
		int divRes=marks/5;
		int roundOff=(divRes+1)*5;
		int diff=roundOff-marks;
		if(diff<3 && roundOff>=40)
		{
			marks=roundOff;
		}
		System.out.println(marks);
		}
	}

}
