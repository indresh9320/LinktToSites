package org.indresh.distance;

import java.util.ArrayList;

public class DistanceBetween2Numbers {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>(10);
		int first=1;
		int second=15;
		arr.add(12);arr.add(10);arr.add(2);arr.add(20);arr.add(11);arr.add(15);arr.add(1);
		
		if(arr.indexOf(second)!=-1 && arr.indexOf(first)!=-1)
		{
		if(arr.indexOf(second)>arr.indexOf(first))
		{
		System.out.println(arr.indexOf(second)-arr.indexOf(first));
		}
		else
		{
			System.out.println(arr.indexOf(first)-arr.indexOf(second));
		}
		}
		else
		{
			System.out.println("The input provided is not present in the List Of Array");
		}
	}

}
