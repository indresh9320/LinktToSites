package Test;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int tC=sc.nextInt();
		int res[]=new int[tC];
		int t=0, arr[],l=0;
		for(int g=0;g<tC;g++)
		{
		t=sc.nextInt();
		arr=new int[t];
		for(int i=0;i<t-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		res[l]=calcMissNumber(arr,t);
		l++;
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
		sc.close();
	}
	
	public static int calcMissNumber(int num[],int t)
	{
		int temp[]=new int[t+1];
		for(int i=0;i<t;i++)
		{
			temp[num[i]]=-1;
		}
		
		for(int k=1;k<=t;k++)
		{
			if(temp[k] != -1)
				return k;
		}
		return 0;
	}
}
