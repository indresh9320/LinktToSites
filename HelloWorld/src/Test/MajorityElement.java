package Test;

import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int tC=sc.nextInt();
		int res[]=new int[tC];
		int t=0, arr[],l=0;
		for(int g=0;g<tC;g++)
		{
			t=sc.nextInt();
			arr=new int[t];
			for(int i=0;i<t;i++)
			{
				arr[i]=sc.nextInt();
			}
			//res[l]=findMajorityElement(arr,t);
			res[l]=majorElement(arr,t,findCandidate(arr,t));
			l++;
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
		sc.close();
	}
	
	public static int findMajorityElement(int num[],int t)
	{
		int temp[]=new int[t+1];
		for(int i=0;i<t;i++)
		{
			temp[num[i]]=temp[num[i]]+1;
		}
		
		for(int k=0;k<=t;k++)
		{
			if(temp[k] > t/2)
				return k;
		}
		return -1;
	}

	public static int findCandidate(int []arr,int size)
	{
		int count=0;
		int cand=0;
		for(int i=0;i<size;i++)
		{
			if(count==0)
			{
				cand=arr[i];
				count=1;
			}
			if(cand==arr[i])
				count++;
			else
				count--;				
		}
		if(count>0)
			return cand;
		return 0;
	}
	
	public static int majorElement(int []arr,int size,int cand)
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(cand==arr[i])
			{
				count++;
			}
		}
		if(count>size/2)
			return cand;
		else
			return -1;
	}

}
