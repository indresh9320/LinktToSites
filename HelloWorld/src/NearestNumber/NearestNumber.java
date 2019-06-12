package NearestNumber;

import java.util.Scanner;

public class NearestNumber {

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
int testCases=sc.nextInt();
int M[]=new int[testCases];
int N[]=new int[testCases];
int divRes[]=new int[testCases];
int mulResLow[]=new int[testCases];
int mulResExact[]=new int[testCases];
int mulResHigh[]=new int[testCases];

for(int i=0;i<testCases;i++)
{
M[i]=sc.nextInt();
N[i]=sc.nextInt();

divRes[i]=M[i]/N[i];
mulResLow[i]=(divRes[i]-1)*N[i];
mulResExact[i]=(divRes[i])*N[i];
mulResHigh[i]=(divRes[i]+1)*N[i];
}


for(int i=0;i<testCases;i++)
{
	int a1=Math.abs(M[i]-mulResLow[i]);
	int a2=Math.abs(M[i]-mulResExact[i]);
	int a3=Math.abs(M[i]-mulResHigh[i]);
	
	//Positive Integer
	if(M[i]>0 && a1<a2 && a1<a3)
		System.out.println((divRes[i]-1)*N[i]);
	if(M[i]>0 && a2<a1 && a2<a3)
		System.out.println((divRes[i])*N[i]);
	if(M[i]>0 && a3<a1 && a3<a2)
		System.out.println((divRes[i]+1)*N[i]);
	
	//Negative Integer
	if(M[i]<0)
		System.out.println((divRes[i]-1)*N[i]);
	
/*if(Math.abs(M[i]-mulResLow[i]) < Math.abs(M[i]-mulResExact[i]) && Math.abs(M[i]-mulResLow[i]) < Math.abs(M[i]-mulResHigh[i]))
	System.out.println(divRes[i]*N[i]);
	
if(Math.abs(M[i]-mulResExact[i]) < Math.abs(M[i]-mulResLow[i]) && Math.abs(M[i]-mulResExact[i]) < Math.abs(M[i]-mulResHigh[i]))
	System.out.println(divRes[i]*N[i]);
	
if(Math.abs(M[i]-mulResHigh[i]) < Math.abs(M[i]-mulResExact[i]) && mulResHigh[i] < Math.abs(M[i]-mulResLow[i]))
	System.out.println(divRes[i]*N[i]);

if(a1==a2 || a1==a3 || a2==a3)
	System.out.println(divRes[i]*N[i]);*/

}
}

}
