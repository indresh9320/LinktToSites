package org.indresh.solution;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<3;i++)
		{
			arr[i]=sc.nextInt();
		}
		//double res[]=new double[3];
		double res[]=plusMinus(arr);
		for(int i=0;i<3;i++)
		{
			System.out.println(res[i]);
		}
		sc.close();
	}
	
	public static double[] plusMinus(int arr[])
	{
		int n=arr.length;
		double res[]=new double[3];
		int plus=0,minus=0,zero=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
				plus++;
			if(arr[i]<0)
				minus++;
			if(arr[i]==0)
				zero++;
		}
		DecimalFormat df=new DecimalFormat("#.#####");
		res[0]=(double)plus/n;
		res[1]=(double)minus/n;
		res[2]=(double)zero/n;
		return res;
	}
}
