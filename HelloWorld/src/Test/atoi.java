package Test;

import java.util.Scanner;

public class atoi {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		for(int i=0;i<n;i++)
		{
			processATOI(str[i]);
		}
	}
	
		public static void processATOI(String str)
		{
			if(str.matches("[a-zA-Z]+")==false)
			{
				System.out.println(str);
			}
			else
			{
				System.out.println("-1");
			}
		}
}