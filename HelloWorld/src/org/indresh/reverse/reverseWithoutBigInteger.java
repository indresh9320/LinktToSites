package org.indresh.reverse;

import java.util.Stack;

public class reverseWithoutBigInteger {

	public static void main(String[] args) {
		String input="-1534236469";
		char inpChr[]=input.toCharArray();
		logic(inpChr);
	}
	
	public static String logic(char[] input)
	{
		String output="";
		Stack<Character> stk=new Stack<>();
		for(int i=0;i<input.length;i++)
			stk.push(input[i]);
		while(!stk.isEmpty())
		{
			if(stk.peek()=='-') {
				//System.out.println(stk.pop());
				output=stk.pop()+output;
			}
			else
			{
				output=output+stk.pop();
			}
		}
		System.out.println(output);
		return output;
	}

}
