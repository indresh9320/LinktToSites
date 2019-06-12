package PairCubeCount;

import java.util.Scanner;

public class PairCubeCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		int count[]=new int[testCases];
		for(int i=0;i<testCases;i++)
		{
			int N=sc.nextInt();
			for(int a=1;a<10;a++)
			{
				for(int b=0;b<10;b++)
				{
					if(Math.pow(a,3)+Math.pow(b,3)==N)
					{
						count[i]++;
					}
				}
			}
		}
		
		for(int i=0;i<testCases;i++)
		{
			System.out.println(count[i]);
		}
	}

}
