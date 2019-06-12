package org.indresh.reverse;

import java.math.BigInteger;

public class reverse32BitInteger {

	public static void main(String[] args) {
		
		System.out.println(reverse(1534236469));

	}
	
	public static BigInteger reverse(int input)
	{
		 BigInteger res = new BigInteger("0");
		 BigInteger ten = new BigInteger("10");
		int rem;
		if(input==0)
			return res;
		else
		{
			while(input!=0)
			{
				rem=input%10;
				//res=res.multiply("10");
				res=(res.multiply(ten)).add(BigInteger.valueOf(rem));
				input=input/10;
			}
		}
		return res;
	}

}
