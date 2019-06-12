package ArithmeticProgression;

import java.util.Scanner;

public class ArithmeticProgression {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int testCases=sc.nextInt();
		
		int inpA[]=new int[2];
		int nthEle=0;
		int res[]=new int[testCases];
		
		for(int i=0;i<testCases;i++)
		{
			inpA[0]=sc.nextInt();
			inpA[1]=sc.nextInt();
			nthEle=sc.nextInt();
			int subtract=inpA[1]-inpA[0];
			res[i]=inpA[0]+(nthEle-1)*subtract;
		}
		
		for(int i=0;i<testCases;i++)
		{
		
		System.out.println(res[i]);
		}
		
		
		
		

	}

}
