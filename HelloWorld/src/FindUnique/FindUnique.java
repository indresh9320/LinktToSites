package FindUnique;

import java.util.*;

public class FindUnique {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		SortedSet hs = new TreeSet();
		for(int i=0;i<str.length();i++)
		{
			char inp = str.charAt(i);
			hs.add(inp);
		}
		System.out.println(hs);
	}
}
