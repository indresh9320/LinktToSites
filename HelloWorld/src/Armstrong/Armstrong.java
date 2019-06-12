package Armstrong;

import java.util.Scanner;

public class Armstrong {

		public static void main (String[] args) {
			
			Scanner sc=new Scanner(System.in);
			int testCases=sc.nextInt();
			
			int inpArr[]=new int[testCases];
			int inpArrTmp[]=new int[testCases];
			double sum[]=new double[testCases];
			for(int i=0;i<testCases;i++)
			{
			    inpArr[i]=sc.nextInt();
			    inpArrTmp[i]=inpArr[i];
			    //inpArr[i]=123;
			    while(inpArr[i]!=0)
			    {
			        int rem=inpArr[i]%10;
			        sum[i]=sum[i]+Math.pow(rem, 3);
			        inpArr[i]=inpArr[i]/10;
			    }
			}
			for(int i=0;i<testCases;i++)
			{
				if(sum[i]==(float)inpArrTmp[i])
				{
					System.out.println("Yes");
				}
				else
				{
					System.out.println("No");	
				}
			}
		}
	}
