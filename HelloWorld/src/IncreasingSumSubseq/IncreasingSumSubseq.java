package IncreasingSumSubseq;

import java.util.Scanner;

public class IncreasingSumSubseq {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		CalcIncSumSub(arr,size);
	}
	
	public static void CalcIncSumSub(int arr[],int size)
	{
		int arrNew[]=new int[size];
		arrNew[0]=arr[0];
		int max=arr[0],j=0;
		for(int i=1;i<size;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
				arrNew[j]=max;
				j++;
			}
			else
			if(max==arr[i])
			{
				max=arr[i];
				arrNew[j+1]=max;
				j++;
			}
		}
		arrNew[j+1]=arr[size-1];
		for(int k=0;k<size;k++)
		{
			if(arrNew[k]!=0)
				System.out.print(arrNew[k]+" ");
		}
	}
}
