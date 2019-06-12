package org.indresh.copy;

import java.util.Arrays;

public class Ex {
	private int[] data;
	public Ex(int []a)
	{
		data=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		data[i]=a[i];
	}
	}
	
	public void show() {
		System.out.println(Arrays.toString(data));
	}
}
