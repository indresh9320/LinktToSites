package org.indresh.prefix;

public class FindPrefix {

	public static void main(String[] args) {
		
		FindPrefix fp=new FindPrefix();
		//System.out.println(fp.comparePrefix("abc","ab"));
		String arr[]= {"geeksforgeeks", "geeks", "geek", "geezer"};
		fp.Solution(arr);
		//System.out.println(fp.findSmallest(arr));

	}
	
	void Solution(String arr[])
	{
		String smallestStr=findSmallest(arr);
		String resString="";
		System.out.println(smallestStr);
		for(int i=0;i<arr.length;i++)
		{
			resString=comparePrefix(arr[i],smallestStr);
		}
		if(!(resString.isEmpty()))
		{
			System.out.println(resString);
		}
		else
		{
			System.out.println("No");
		}
	}
	
	String comparePrefix(String str1,String str2)
	{
		boolean res=str1.contains(str2);
		if(res==true)
			return str2;
		else
			return "";
	}
	
	public static String findSmallest(String []arr)
	{
		int min=Integer.MAX_VALUE;
		String minString="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()<min)
			{
				min=arr[i].length();
				minString=arr[i];
			}
		}
		return minString;
	}

}
